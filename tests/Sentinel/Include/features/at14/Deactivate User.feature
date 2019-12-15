Feature: Title of your feature
  I want to use this template for my feature file


  Scenario: Deactivate User
		Given I am at the Profile Page with user "1234@mail.com"
		And I click in the "Deactivate Account Profile" button
		And I click "Yes Profile" in the popup
		And I return back to the Dashboard to login
		Then I can't login