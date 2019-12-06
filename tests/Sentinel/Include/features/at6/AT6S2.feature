Feature: Send Tweet
  As authenticated user
	I want to tweet the information about the application
	So i can share the information


  Scenario: Tweet cancelled
    Given I am at the Dashboard Authenticated
		And I click in the "Share Dashboard Auth" button
		And I click in "Tweet Back" button on the twitter
		Then  I click in "Tweet Discard" button on the twitter