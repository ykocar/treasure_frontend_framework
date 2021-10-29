
Feature: Logout

  Scenario Outline: User logout
    Given the user is on the sign-in page
    When the user signed in using "<email>" "<password>"
    And the user clicks usermenu button
    And the user clicks logout on homepage
    Then the user is on the login page

    Examples:

      | email                      | password         |
      | treasurecloud703@gmail.com | TreasureCloud703 |
      | treasurecloud704@gmail.com | TreasureCloud704 |
