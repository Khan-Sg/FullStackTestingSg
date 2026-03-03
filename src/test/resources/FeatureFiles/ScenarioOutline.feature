Feature: Login And Logout Functionality
  Scenario Outline:Verify Login Functionality
    Given I Launch chrome Browser
    And I Navigate the application URL
    And I find the login page
    When I enter username in "<username>" text field
    And I enter password in "<password>" text field
    And I click the login button
    Then I find the homePage
    And I minimize the Flyout Window
    Given Then I find the homePage after Login
    When I click on logout link
    Then I find the login page after logout
    And I logout the browser
Examples:
    Examples:
      | username | password  |
      | admin    | manager   |
      | user2    | wrongpass |
      | user3    | pass456   |
      |admin     |manager    |