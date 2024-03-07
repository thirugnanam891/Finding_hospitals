Feature: Finding Hospitals

  Scenario: User searches for doctors with specific criteria
    Given the user navigates to practo com
    When the user validates the HomepageTitle
    Then the user Navigates to the Find Doctors page
    And the user selects the city Chennai
    And filters the search by Dentist
    When the user applies filters
    Then the user should display the details of te first 5 doctors

  Scenario: User retrieves a list of surgeries
    Given user navigates to the practo home page
    When user clicks on surgeries in the practo home page
    Then user validates the surgeries page
    Then user scrolls down the page
    And user should capture the list of surgeries

  Scenario: Schedule a demo in health and wellness plans for corporates
    Given the user navigates to practo page
    When user clicks on for corporates in practo home page navigation bar
    And user clicks health and wellness plans in for corporates 
    Then user navigates to health and wellness plans page and validate the page
    When user provide invalid email id and valid details for other fields in the form
    Then user validates schedule a demo button is enabled in the health and wellness plans page
    When user enters valid email id and clicks on schedule a demo button
    Then user validates schedule a demo button is enabled in the health and wellness plans page
    Then user validates the Thank you message is displayed
    Then user takes a screenshot of thank you message
