Feature: Profile Page
  As an authenticated user
	I want to be able to check my profile information and to change my password
	So that i can login with a different password


  Scenario: Try Change password empty fields
  	Given I am at the Profile Page
		Then I click in the "Alter Password Profile" button