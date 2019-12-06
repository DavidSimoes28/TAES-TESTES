Feature: Send page exists
			As a user i want to check if all the fields exist in the send page
			So that i can in the future send sensor data

  Scenario: Send Page Exists
	Given I am at the send page
	
	And I can see if the temperatura, humidade and temperatura field exists
	
	And I can see if the "SEND (2)" button for at8 exists
	
	And I can see if the "CANCEL" button for at8 exists
	
	Then I return back to the dashboard

