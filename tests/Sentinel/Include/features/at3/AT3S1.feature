Feature: Register in application
  As a guest
  I want to register in the application
  So i can use the application totally

  Scenario: Register page field exist
    Given I am at the register page
    And i can see if the email field exists
    And i can see if the password field exists
    And i can see if password confirmation field exists
    And i can see if register button exists
    Then i can see if the cancel button exists
