Feature: Refresh Button
  As an authenticated user
	I want to click in the refresh button
	So that i can see most recent values

  Scenario: Click Refresh button at Dashboard
		Given I am at the Dashboard Authenticated
		And I click in the "Refresh Dashboard Auth" button
		Then I see the updated values on "Data Refresh Dashboard Auth"