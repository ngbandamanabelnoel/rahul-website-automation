@tag
Feature: Get logged into the web site
  Background:
    Given I landed on the login page.

  @nominalvalidations
  Scenario Outline: Negative tests for connexion
    Given logged in with incorrect username <username> and  password <password>
    When clicked on login button.
    Then I get the mesage "Login Successfully" on display.

    Examples:
      | username 					| password   |
      | "abelngbandaman@gmail.com"  | "Mba@2026" |
  @errorsvalidations
  Scenario Outline: Negative tests for connexion
    Given logged in with incorrect username <username> and  password <password>
    When clicked on login button.
    Then I get the mesage "Incorrect email or password." on display.

    Examples:
      | username 					 | password    |
      | "abelngbandamans@gmail.com"  | "Mbas@2026" |