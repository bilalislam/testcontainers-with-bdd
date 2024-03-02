package org.testcontainers.demo.infrastructure.configs.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.demo.domain.constant.TicketCdcMigrateRabbitConstants;

@Configuration
public class TicketCdcMigrationRabbitConfig {


    public static final int MESSAGE_TTL = 600000; // 10 minutes

    @Bean
    public DirectExchange ticketCdcMigrateExchange() {
        return ExchangeBuilder
                .directExchange(TicketCdcMigrateRabbitConstants.EXCHANGE)
                .build();
    }

    @Bean
    public Queue ticketCdcQueue() {
        return QueueBuilder
                .durable(TicketCdcMigrateRabbitConstants.QUEUE)
                .withArgument("x-dead-letter-exchange", "")
                .withArgument("x-dead-letter-routing-key", TicketCdcMigrateRabbitConstants.QUEUE_DLQ)
                .build();
    }

    @Bean
    public Queue ticketCdcQueueDlq() {
        return QueueBuilder
                .durable(TicketCdcMigrateRabbitConstants.QUEUE_DLQ)
                .withArgument("x-message-ttl", MESSAGE_TTL)
                .withArgument("x-dead-letter-exchange", "")
                .withArgument("x-dead-letter-routing-key", TicketCdcMigrateRabbitConstants.QUEUE)
                .build();
    }

    @Bean
    public Queue ticketCdcParkingLotQueue() {
        return new Queue(TicketCdcMigrateRabbitConstants.QUEUE_PARKING_LOT);
    }

    @Bean
    public Binding ticketCdcBinding(Queue ticketCdcQueue, DirectExchange ticketCdcMigrateExchange) {
        return BindingBuilder
                .bind(ticketCdcQueue)
                .to(ticketCdcMigrateExchange)
                .with(TicketCdcMigrateRabbitConstants.ROUTING);
    }

    @Bean
    public Binding ticketCdcParkingLotBinding(Queue ticketCdcParkingLotQueue, DirectExchange ticketCdcMigrateExchange) {
        return BindingBuilder
                .bind(ticketCdcParkingLotQueue)
                .to(ticketCdcMigrateExchange)
                .with(TicketCdcMigrateRabbitConstants.ROUTING_PARKING_LOT);
    }
}