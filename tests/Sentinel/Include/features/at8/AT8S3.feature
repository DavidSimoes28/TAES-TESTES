
Feature: Send Valid Sensor Data
  As a user i want to fill all field to send sensor
  So that i can check if sensor exists

  Scenario Outline: Send Valid Sensor Data
		Given I am at the send page
		And I click in the "Send Send" button
		Then I return back to the dashboard