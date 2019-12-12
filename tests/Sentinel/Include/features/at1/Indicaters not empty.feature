Feature: Title of your feature
  I want to use this template for my feature file


  Scenario: Indicaters not empty
  	Given I am at the dashboard
		And I can see if the "Humidity Dashboard" text is not empty
		And I can see if the "Temperature Dashboard" text is not empty
		And I can see if the "Data Dashboard" text is not empty
		Then I can see if the "Global Dashboard" text is not empty