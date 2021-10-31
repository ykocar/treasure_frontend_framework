
Feature: Downloading files

  Scenario Outline: Downloading files
    Given the user is on the sign-in page
    When the user signed in using "<email>" "<password>"
    And the user selects the file to be downloaded
    And the user clicks download tag
    Then the user sees the download message

    Examples:

      | email                      | password         |
      | treasurecloud703@gmail.com | TreasureCloud703 |

