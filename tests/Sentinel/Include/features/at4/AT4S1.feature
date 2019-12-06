Feature: Dashboard authenticated user
  As a authenticated user
	When I finished the authentication
	So i can see the authenticated dashboard


  Scenario: Dashboard fields exists
    Given I am at the Dashboard Authenticated
		And I can see if the "Send Dashboard Auth" button exists
		And I can see if the "My Exposure Dashboard Auth" button exists
		And I can see if the "Favorite Dashboard Auth" button exists
		And I can see if the "Logout Dashboard Auth" button exists
		And I can see if the "Share Dashboard Auth" button exists
		And I can see if the "Dashboard Auth" dropdown exists
		And I can see if the "Humidity Dashboard Auth" text exists
		And I can see if the "Temperature Dashboard Auth" text exists
		And I can see if the "Data Dashboard Auth" text exists
		And I can see if the "Global Dashboard Auth" text exists
		Then I can see if the "Statistics Dashboard Auth" button exists