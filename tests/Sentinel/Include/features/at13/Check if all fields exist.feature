Feature: Title of your feature
  I want to use this template for my feature file


  Scenario: Check if all fields exist
		Given I am at the Profile Page
		And I can see if the "Email Profile" text exists
		And I can see if the "Name Profile" text exists
		And I can see if the "Old Password Profile" field exists
		And I can see if the "New Password Profile" field exists
		And I can see if the "Confirmation Password Profile" field exists
		And I can see if the "Cancel Profile" button exists
		Then I can see if the "Alter Password Profile" button exists