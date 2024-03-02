package bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class ClaimProcessSteps {
    @Given("claim processing is up and running")
    public void claim_processing_is_up_and_running() {

    }

    @When("wait for {int} seconds")
    public void waitForXSeconds(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    @Then("the claim status is sent to message queue for communication")
    public void claim_status_is_sent_to_message_queue_for_communication() {
    }

    @When("a claim request of {string} policy with claim amount {double} is submitted queue")
    public void a_claim_request_is_submitted_queue(String product, Double amount) {

    }

    @Then("the claim case is reviewed and saved to database with status {string}")
    public void claim_status_is_reviewed_and_saved_to_database_with_status(String status) {

    }
}
