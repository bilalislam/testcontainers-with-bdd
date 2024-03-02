package org.testcontainers.demo.infrastructure.configs.rabbitmq;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "rabbitmq")
public class RabbitProperties {
    private String address;
    private String username;
    private String password;
    private Integer retryCount;
    private Integer concurrentConsumers;
}