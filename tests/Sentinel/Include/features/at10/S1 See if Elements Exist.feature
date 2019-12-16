Feature: Favorites Page
  As an authenticated user
	I want to access the favorites dashboard 
	So i can check all the favorites pages and remove some favorites too


  Scenario: See if Elements Exist
    Given I am at the Favorites Page
    Then I check if the "Favorites" List Exists