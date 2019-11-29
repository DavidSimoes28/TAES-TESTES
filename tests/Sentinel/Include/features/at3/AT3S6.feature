Feature: Register in application
  As a guest
  I want to register in the application
  So i can use the application totally

  Scenario: Register with a incorrect email
    Given I am at the register page
    And i insert "qwerty" in the email field
    And i insert "123123" in the password field
    And i insert "123123" in the password confirmation field
    Then i click in the "REGISTER (1)" button
