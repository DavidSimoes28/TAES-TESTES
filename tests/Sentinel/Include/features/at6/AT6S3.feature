Feature: Send Tweet
  As authenticated user
	I want to tweet the information about the application
	So i can share the information


  Scenario: Tweet cancelled
    Given I am at the Dashboard Authenticated
		And I click in the "Share Dashboard Auth" button
		And I click in "Tweet Twitter" button on the twitter
		Then I verify if my tweet is tweeted