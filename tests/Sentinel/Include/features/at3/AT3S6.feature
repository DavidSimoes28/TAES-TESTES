Feature: Register in application
  As a guest
  I want to register in the application
  So i can use the application totally

  Scenario: Register with a incorrect email
    Given I am at the register page 
    And I insert "qwerty" in the "Email Register" field
		And I insert "123123" in the "Password Register" field
		And I insert "123123" in the "Password Confirmation" field
		Then I click in the "Register Register" button
