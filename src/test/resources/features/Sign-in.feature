@smoke
Feature: Sign-in

  Background:
    Given the user is on the sign-in page

  Scenario Outline: User sign-in with valid credentials
    When the user signed in using "<email>" "<password>"
    Then the user should be able to sign in

    Examples:

      | email                      | password         |
      | treasurecloud703@gmail.com | TreasureCloud703 |
      | treasurecloud704@gmail.com | TreasureCloud704 |


  Scenario: User sign-in with invalid or blank credentials
    When the user logs in using "email" or ""
    Then the user should not be able to login