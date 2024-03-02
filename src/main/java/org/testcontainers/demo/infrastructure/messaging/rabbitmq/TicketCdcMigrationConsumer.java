package org.testcontainers.demo.infrastructure.messaging.rabbitmq;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.testcontainers.demo.domain.constant.TicketCdcMigrateRabbitConstants;
import org.testcontainers.demo.domain.event.TroubleTicketCreatedEvent;
import org.testcontainers.demo.infrastructure.configs.rabbitmq.RabbitProperties;
import org.testcontainers.demo.infrastructure.utils.RabbitUtils;

@Slf4j
@Service
@RequiredArgsConstructor
public class TicketCdcMigrationConsumer {
    private final RabbitProperties rabbitProperties;
    private final RabbitTemplate rabbitTemplate;

    /*
     * todo : consume the event from the rabbitmq on testcontainers
     * consume event
     * execute the business logic (external ignore edildiğinde testler stale olur,ticket id ile get edilmesi lazım)
     * store to the mongo
     * raise the event to kafka
     * */
    @RabbitListener(queues = TicketCdcMigrateRabbitConstants.QUEUE, containerFactory = "startListenerContainerFactory")
    public void consumeTicket(@Payload TroubleTicketCreatedEvent troubleTicketCreatedEvent, Message amqpMessage) {
        try {
            log.info("Event:  {}", troubleTicketCreatedEvent);
        } catch (Exception e) {
            log.error("Migration error", e);
            int count = RabbitUtils.getXDeathCountFromHeader(amqpMessage);
            log.debug("x-death count: {}", count);

            if (count >= rabbitProperties.getRetryCount()) {
                rabbitTemplate.send(TicketCdcMigrateRabbitConstants.EXCHANGE, TicketCdcMigrateRabbitConstants.ROUTING_PARKING_LOT, amqpMessage);
                return;
            }

            throw new AmqpRejectAndDontRequeueException("Failed consume operations");
        }
    }

}
