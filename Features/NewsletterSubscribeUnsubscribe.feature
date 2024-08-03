Feature: Subscribe to the newsletter

  Scenario: User likes to subscribe the newsletter
    Given User navigates to the Login Page.
    And User provides valid "username" and "password"
    And User click the Login button
    And User navigates to the MyAccount page
    When User clicks on SubscribeOrUnsubscribe link of newsletter
    And User clicks on YES radiobutton in the Newsletter page
    Then Yes Radio button gets selected in the Newsletter page
    When user clicks on the Continue Button
    Then A success message is displayed for Newsletter Subscription update
    

  Scenario: User likes to Unsubscribe the newsletter
    Given User navigates to the Login Page.
    And User provides valid "username" and "password"
    And User click the Login button
    And User navigates to the MyAccount page
    When User clicks on SubscribeOrUnsubscribe link of newsletter
    And User clicks on NO radiobutton in the Newsletter page
    Then No Radio button gets selected in the Newsletter page
    When user clicks on the Continue Button
    Then A success message is displayed for Newsletter Subscription update
    