Feature: Create And Delete User
  Scenario:Create and Delete the User
    Given I Launch chrome Browser
    And I Navigate the application URL
    And I find the login page
    When I enter username in username text field
    And I enter password in password text field
    And I click the login button
    Then I find the homePage
    And I minimize the Flyout Window
    And I click the user button
    When I click add user button
    When I enter the Firstname in text field
    And I enter the lastname in text field
    And I enter the email in text field
    And I enter the username in User text field
    And I enter the password in user password text field
    And I enter the confirm password in user password text field
    When I click the create user button
    Given Then I find the user list page
    When I click the user1 button
    And I click the delete user button
    And I click the delete the permanent button
    Given Then I find the user list page
    When I click on logout link
    Then I find the login page after logout
    And I logout the browser