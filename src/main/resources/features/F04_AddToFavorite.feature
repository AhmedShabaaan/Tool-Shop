@regression
Feature: testing add to favorite functionality

  @happyscenarios
  Scenario: Successfully adding an item to favorites
    Given the user is on the homepage
    When the user logs in with valid credentials
    And navigates to the products page
    And adds a product to favorites
    Then the product appears in the favorites list
    And the favorites icon reflects the correct item count
