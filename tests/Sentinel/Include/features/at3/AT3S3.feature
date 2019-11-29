Feature: Register in application
  As a guest
	I want to register in the application
	So i can use the application totally
	
  Scenario: Register with password and password confirmation different
   	Given I am at the register page

		And i insert "1234@mail.com" in the email field

		And i insert "1234" in the password field

		And i insert "12341234" in the password confirmation field

		Then i click in the "REGISTER (1)" button