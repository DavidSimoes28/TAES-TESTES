
Feature: Forget password
  As a guest
	I want to recorver the password
	So I can login
	
  Scenario: Forget password page exists	
    Given I am at the forget pasword page
		And i can see if the email field exists
		Then i can see if the "SEND EMAIL TO RESET PASSWORD" button exists