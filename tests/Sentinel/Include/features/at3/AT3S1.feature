Feature: Register in application
  As a guest
  I want to register in the application
  So i can use the application totally

  Scenario: Register page field exist
    Given I am at the register page
    And I can see if the "Email Register" field exists
    And I can see if the "Password Register" field exists
    And I can see if the "Password Confirmation" field exists
    And I can see if the "Register Register" button exists
    Then I can see if the "Cancelar Register" button exists
