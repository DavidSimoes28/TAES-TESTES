Feature: Add/Remove sensor to favorites
  As an authenticated user
  I want to add a sensor to my favorites
  So i can have favorites sensors

  
  Scenario: Check if button favorites button exists
	  Given I am at the Dashboard Authenticated
		Then I can see if the "Add-Remove Favorite" button exists
