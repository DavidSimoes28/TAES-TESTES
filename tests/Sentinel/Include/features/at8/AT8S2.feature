Feature: Send page exists
			As a user i want to check if all the fields exist in the send page
			So that i can in the future send sensor data

  Scenario: Send Page Exists
  
	Given I am at the send page
	
	And I can see if the "Temperature" field exists
	
	And I can see if the "Humidade" field exists
	
	And I can see if the "Send Send" button exists
	
	And I can see if the "Send Cancel" button exists
	
	Then I return back to the dashboard

