
Feature: Forget password
  As a guest
	I want to recorver the password
	So I can login
	
  Scenario: Forget password page exists	
    Given I am at the forget pasword page
		And I can see if the "Email Forget Password" field exists
		Then I can see if the "Send Email" button exists