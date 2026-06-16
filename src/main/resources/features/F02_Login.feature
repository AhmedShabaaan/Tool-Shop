@regression
Feature: this feature could allow guest user to sign in to app
  @smoke
  Scenario: user login with valid data
    Given user go to login page
    When user enter valid email already is registered
    And user enter his password
    And user click on login button
    Then user go to the home page

  @negative
  Scenario: user login with invalid data
    Given user go to login page
    When user enter invalid email that is not register password
    And user click on login button
    Then user should see error message