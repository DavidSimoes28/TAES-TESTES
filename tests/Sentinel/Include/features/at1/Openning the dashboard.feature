Feature: Dashboard screen to guest users
  As a guest
	I want to access to my dashbord
	So that i can see the global information about Edificio A 


  Scenario: Openning the dashboard
   	Given I am at the dashboard
   	And I can see if the "Dashboard Login" button exists
		And I can see if the "Register Dashboard" button exists
		And I can see if the "Help Dashboard" button exists
		And I can see if the "Humidity Dashboard" text exists
		And I can see if the "Temperature Dashboard" text exists
		And I can see if the "Data Dashboard" text exists
		Then I can see if the "Global Dashboard" text exists