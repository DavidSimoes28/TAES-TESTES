Feature: Forget password
  As a guest
	I want to recorver the password
	So I can login


  Scenario: Reset password OK
    Given I am at the forget pasword page
		And I insert "123@mail.com" in the "Email Forget Password" field
		Then I click in the "Send Email" button