
Feature: Uploading files

  Scenario Outline: Uploading files
    Given the user is on the sign-in page
    When the user signed in using "<email>" "<password>"
    And the user clicks Plus button
    And the user uploads a file
    Then the user sees the upload message

    Examples:

      | email                      | password         |
      | treasurecloud703@gmail.com | TreasureCloud703 |

