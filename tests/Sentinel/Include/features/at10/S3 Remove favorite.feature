Feature: Favorites Page
  As an authenticated user
	I want to access the favorites dashboard 
	So i can check all the favorites pages and remove some favorites too

  Scenario: Remove favotire
  	Given I am at the Favorites Page
		And I click the "Favorite" item of the List
		And I click "Sim Popup" in the popup
		Then The favorite is removed