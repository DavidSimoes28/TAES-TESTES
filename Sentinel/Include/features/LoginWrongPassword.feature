#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login with a wrong password
  As a user 
  I want to click the Login button
  So that i can try to Login with an account with the wrong password

  Scenario Outline: Try to login with wrong password
   Given I am at the dashboard

   And I click the login button

   Then I am at the login page

   And I insert "123@mail.com" in the email field

   And I insert "123" in the password field

   Then I click in the login button