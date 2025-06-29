@regrsesion
Feature: testing add to cart functionality

  @happyscenarios
  Scenario: Successfully adding an item to the cart
    Given the user is on the homepage
    When the user logs in with valid credentials
    And navigates to the products page
    And adds a product to the cart
    Then the product appears in the cart
    And the cart icon reflects the correct item count
