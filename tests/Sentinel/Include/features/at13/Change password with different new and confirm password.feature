Feature: Profile Page
  As an authenticated user
	I want to be able to check my profile information and to change my password
	So that i can login with a different password


  Scenario: Change password with different new and confirm password
    Given I am at the Profile Page
		And I insert "123123" in the "Old Password Profile" field
		And I insert "1231234" in the "New Password Proflie" field
		And I insert "123123" in the "Confirmation Password Profile" field
		Then I click in the "Alter Password Profile" button