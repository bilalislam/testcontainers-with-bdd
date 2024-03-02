package org.testcontainers.demo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestConsumer {
    @KafkaListener(topics = {"test"}, groupId = "test-group")
    public void consume(@Payload String data, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
        log.info("Consume data from Kafka. Topic: {}, Event: {}", topic, data);
    }
}
