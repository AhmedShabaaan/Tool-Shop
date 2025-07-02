@regression
Feature: user can add products into favorite and access them late
  Scenario: Successfully adding a product to the favorites list
    Given user loged in and go home page
    And   user navigates to the By category chekbox
    When the user clicks on the favorite product of their preferred tool
    And  user click on my favourite
    Then the tool should be added to the user's favorites list