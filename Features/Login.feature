Feature: To check the login feature of the application.
  #@sanity
  #Scenario: Check Login with Valid inputs
  #Given User navigates to the Login Page.
  #When User provides valid "username" and "password"
  #And User click the Login button
  #Then User navigates to the MyAccount page
  
  #@regression
  #Scenario: Check Login with Invalid inputs
  #Given User navigates to the Login Page.
  #When User provides invalid "username" and invalid "password"
  #And User click the Login button
  #Then User should remain in the Login page
  #And User should get an error message.
  
  @sanity
  Scenario Outline: Check Login with Data Driven Test
    Given User navigates to the Login Page.
    When User provides valid "<email>" and "<passwd>"
    And User click the Login button
    Then User navigates to the MyAccount page

    Examples: 
      | email                     | passwd   |
      | pavanoltraining@gmail.com | test@123 |
      | vijaya@gmail.com          | test123  |
