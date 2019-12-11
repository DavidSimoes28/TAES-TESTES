Feature: Add/Remove sensor to favorites
  As an authenticated user
  I want to add a sensor to my favorites
  So i can have favorites sensors


  Scenario: Click Add/Remove Favorites Button
    Given I am at the Dashboard Authenticated
    And I click in the "Add-Remove Favorite" button
    Then I verify if the favorite is on database