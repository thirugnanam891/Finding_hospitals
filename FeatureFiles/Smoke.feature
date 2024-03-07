Feature: All tests
 
  @smoke
  Scenario: User searches for practo homepage
    Given the user navigates to practo com
    Then the user Navigates to the Find Doctors page
    Then the user selects the city Chennai
    And filters the search by Dentist
    When the user applies filters
    Then the user should display the details of te first 5 doctors
 
  @smoke
  Scenario: Surgeries Page Navigation in practo website
    Given user navigates to the practo home page
    When user clicks on surgeries in the practo home page
    Then user validates the surgeries page
 
  @smoke
  Scenario: User retrieves a list of surgeries
    Given user navigates to the practo home page
    When user clicks on surgeries in the practo home page
    Then user scrolls down the page
    And user should capture the list of surgeries
  @smoke
  Scenario: Corporate Health and Wellness Form Validation
    Given the user navigates to practo page
    When user clicks on for corporates in practo home page navigation bar
    And user clicks health and wellness plans in for corporates
    When user provide invalid email id and valid details for other fields in the form
    Then user validates schedule a demo button is enabled in the health and wellness plans page
 
  @smoke
  Scenario: Corporate Health and Wellness Form Validation
    Given the user navigates to practo page
    When user clicks on for corporates in practo home page navigation bar
    And user clicks health and wellness plans in for corporates
    When user enters valid emailid and clicks on schedule a demo button
    Then user validates schedule a demo button is enabled in the health and wellness plans page
     Then user validates the Thank you message is displayed