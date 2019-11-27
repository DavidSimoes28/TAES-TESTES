Feature: Forget password
  As a guest
	I want to recorver the password
	So I can login


  Scenario: Reset password cancelled
    Given I am at the forget password page

		And i insert "123@mail.com" in the email field

		And i click in the send email button

		And i login in a email 

		And i open de email recived

		And i click in the link present on the email

		Then i cancel the reset password