Feature: To succesfully Register an account for a new user

  @regression
  Scenario: Register an user with all required details
    Given User navigates to Register Account page
    And User provides all required details
      | FirstName | Srikrishna |
      | LastName  | Jayakumar  |
      | Telephone | 4265984375 |
      | Password  | password   |
    And User clicks on the private policy check box
    When User clicks on Continue button
    Then User account gets created successfully.
