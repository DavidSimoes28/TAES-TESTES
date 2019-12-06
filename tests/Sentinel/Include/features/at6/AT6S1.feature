Feature: Send Tweet
  As authenticated user
	I want to tweet the information about the application
	So i can share the information


  Scenario: Twitter button exists
    Given I am at the Dashboard Authenticated
		Then I can see if the "Share Dashboard Auth" button exists