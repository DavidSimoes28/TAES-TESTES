Feature: Profile Page
  As an authenticated user
	I want to be able to check my profile information and to change my password
	So that i can login with a different password


  Scenario: Check if all fields exist
		Given I am at the Profile Page
		And I can see if the "Email Profile" text exists
		And I can see if the "Name Profile" text exists
		And I can see if the "Old Password Profile" field exists
		And I can see if the "New Password Profile" field exists
		And I can see if the "Confirmation Password Profile" field exists
		And I can see if the "Cancel Profile" button exists
		Then I can see if the "Alter Password Profile" button exists