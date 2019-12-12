  
Feature: Send with Empty fields
  As a user i want to try to send a sensor with all fields empty
  so that i can check if there is a message

  Scenario: Send With Empty Fields
Given I am at the send page
And I click in the "Send Send" button
And I check if i am at Send Sensor Page
Then I return back to the dashboard