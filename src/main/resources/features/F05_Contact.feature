@regression
Feature: Contact Form Submission Functionality

  @happyscenarios
  Scenario: Successfully submitting the contact form with valid data
    Given the user is on the contact page
    When the user enters a valid first name
    And the user enters a valid last name
    And the user enters a valid email address
    And the user selects a valid subject from the dropdown
    And the user types a valid message
    And the user uploads a valid .txt file
    And the user clicks the Send button
    Then a confirmation message should appear confirming successful submission
