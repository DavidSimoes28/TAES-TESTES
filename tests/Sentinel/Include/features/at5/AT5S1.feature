
Feature: Forget password
  As a guest
	I want to recorver the password
	So I can login

  Scenario: Reset password exists
    Given I am in the login page
    Then I can see if the "Forget Password" field exists