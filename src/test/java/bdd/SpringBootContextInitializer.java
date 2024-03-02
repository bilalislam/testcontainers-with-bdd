package bdd;

import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import static bdd.TestContainersSetup.getMongoDBContainerUri;
import static bdd.TestContainersSetup.getRabbitMQContainerIPAddress;
import static bdd.TestContainersSetup.getRabbitMQContainerPort;

public class SpringBootContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {

        TestContainersSetup.initTestContainers(configurableApplicationContext.getEnvironment());

        TestPropertyValues values = TestPropertyValues.of(
                "spring.rabbitmq.host=" + getRabbitMQContainerIPAddress(),
                "spring.rabbitmq.port=" + getRabbitMQContainerPort(),
                "spring.data.mongodb.uri=" + getMongoDBContainerUri()
                //"kafka.bootstrap-servers=" + getBootstrapServers()
        );

        values.applyTo(configurableApplicationContext);
    }
}