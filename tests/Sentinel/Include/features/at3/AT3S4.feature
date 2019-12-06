Feature: Register in application
  As a guest
	I want to register in the application
	So i can use the application totally

  Scenario: Button cancel in register
    Given I am at the register page
		And I click in the "Cancelar Register" button
		Then I return back to the dashboard