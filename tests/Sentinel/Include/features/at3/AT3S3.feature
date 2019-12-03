Feature: Register in application
  As a guest
	I want to register in the application
	So i can use the application totally
	
  Scenario: Register with password and password confirmation different
   	Given I am at the register page
		And I insert "1234@mail.com" in the "Email Register" field
		And I insert "1234" in the "Password Register" field
		And I insert "12341234" in the "Password Confirmation" field
		Then I click in the "Register Register" button