
Feature: Send Valid Sensor Data
  As a user i want to fill all field to send sensor
  So that i can check if sensor exists

  Scenario Outline: Send Valid Sensor Data
		Given I am at the send page
		And i insert <localizacao> in the localização field
		And i insert <humidade> in the Humidade field
		And i insert <temperatura> in the Temperatura field
		And I click the "SEND (6)" button for at8
		Then I return back to the dashboard

    Examples: 
      | localizacao  | humidade | temperatura  |
      | SalaA.21 |     50 | 20 |
      | Gabinete L2 |     70 | 15    |