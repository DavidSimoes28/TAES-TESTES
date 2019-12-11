
Feature: Send Button exists
	As a user i want to check the send button 
	So that in the future i can send sensor data to the database

  Scenario: Send Button exists
				Given I am at the Dashboard Authenticated
				And I can see if the "Send Dashboard Auth" button exists
				Then I return back to the dashboard
