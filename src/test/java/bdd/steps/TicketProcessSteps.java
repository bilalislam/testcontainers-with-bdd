package bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.testcontainers.demo.domain.constant.TicketCdcMigrateRabbitConstants;
import org.testcontainers.demo.domain.event.TroubleTicketCreatedEvent;

import java.util.concurrent.TimeUnit;

/*
 * todo : implement the test framework for the ticket process
 * rest
 * mock
 * mongo template
 * kafka template
 * rabbitmq template
 * */
public class TicketProcessSteps {
    private final RabbitTemplate rabbitTemplate;

    public TicketProcessSteps(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Given("ticket processing is up and running")
    public void claim_processing_is_up_and_running() {
        var event = TroubleTicketCreatedEvent
                .builder()
                .description("test")
                .build();

        rabbitTemplate.convertAndSend(TicketCdcMigrateRabbitConstants.EXCHANGE, TicketCdcMigrateRabbitConstants.ROUTING, event);
    }

    @When("wait for {int} seconds")
    public void waitForXSeconds(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    @Then("the ticket status is sent to message queue for communication")
    public void claim_status_is_sent_to_message_queue_for_communication() {
    }

    @When("a ticket request of {string} policy with claim amount {double} is submitted queue")
    public void a_claim_request_is_submitted_queue(String product, Double amount) {

    }

    @Then("the ticket case is reviewed and saved to database with status {string}")
    public void claim_status_is_reviewed_and_saved_to_database_with_status(String status) {

    }
}
