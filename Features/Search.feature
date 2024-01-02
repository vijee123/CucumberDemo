Feature: To check search feature of the application.

  @regression
  Scenario: Check whether search displays product matching to given data
    Given User enters "productname" in the search box
    When User clicks on the searchIcon
    Then User navigates to search page
    And Any products if displayed should include product name searched for.
