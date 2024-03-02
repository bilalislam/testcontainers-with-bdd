
Feature: Ticket Processing
  Process ticket request triggered by messages

  Scenario Outline: Process ticket request
    Given ticket processing is up and running
    When a ticket request of '<product>' policy with claim amount <amount> is submitted queue
    And wait for 2 seconds
    Then the ticket case is reviewed and saved to database with status '<result>'
    And wait for 1 seconds
    And the ticket status is sent to message queue for communication

    Examples:
    | product | amount | result |
    | HOME    | 10000  | NEED_FOLLOW_UP |
    | MEDICAL | 100    | APPROVED      |
    | MEDICAL | 5000   | DECLINED |
