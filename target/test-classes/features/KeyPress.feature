
Feature: Key Presses page

  Scenario Outline: the user can click the key
    Given the user is on the Menu page
    And the user clicks on "Key Presses" link
    When the user clicks on any "<key>"
    Then the user can see the "<key>" text on web page

    Examples:
      | key |
      | a   |
      | 3   |
      | !   |
      | 13  |