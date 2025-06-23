@regression
Feature: testing registration functionality

  @happyscenarios
  Scenario: user could create new account with valid credentials
    Given user go to register page
    When user enter first and last name
    And user enter date of birth
    And user enter the street
    And user enter postal code
    And user enter the city
    And  user enter the state
    And user select the country
    And user enter the phone
    And user enter valid email address
    And user enter password
    And user click on register button
    Then account is created successfully