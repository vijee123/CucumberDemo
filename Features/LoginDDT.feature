Feature: Test the Login with Valid and Invalid data

  Scenario Outline: Test the login with multiple data from Excel sheet.
    Given User navigates to the Login Page.
    Then User navigates to My Account Page when they enter username and password from excel row "<row_no>"

    Examples: 
      | row_no |
      |      1 |
      |      2 |
      |      3 |
