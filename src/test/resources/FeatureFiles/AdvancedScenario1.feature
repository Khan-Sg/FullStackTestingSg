Feature: Advance Scenario 1
  Scenario:Create And Modify And Delete the Multiple Users
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
    And I click on logout link
    And I find the login page
    When I enter username of user1 in username text field
    And I enter password of user1 in password text field
    And I click the login button
    Then I click the skip explorer page button
    And I click the user button
    When I click add user button
    When I enter the Firstname in text field
    And I enter the lastname of user2 in text field
    And I enter the email of user2 in text field
    And I enter the username of user2 in User text field
    And I enter the password of user2 in user password text field
    And I enter the confirm password of user2 in user password text field
    When I click the create user button
    Given Then I find the user list page
    And I click on logout link
    And I find the login page
    When I enter username of user2 in username text field
    And I enter password of user2 in password text field
    And I click the login button
    Then I click the skip explorer page button
    And I click the user button
    When I click add user button
    When I enter the Firstname in text field
    And I enter the lastname of user3 in text field
    And I enter the email of user3 in text field
    And I enter the username of user3 in User text field
    And I enter the password of user3 in user password text field
    And I enter the confirm password of user3 in user password text field
    When I click the create user button
    Given Then I find the user list page
    And I click on logout link
    And I find the login page
    When I enter username of user3 in username text field
    And I enter password of user3 in password text field
    And I click the login button
    Then I click the skip explorer page button
    And I click on logout link
    And I find the login page
    When I enter username in username text field
    And I enter password in password text field
    And I click the login button
    And I click the user button
    When I click the user1 button
    When I clear the data from password text field
    When I clear the data from confirm password text field
    And I reenter the password to password text field
    And I reenter the confirm password to password text field
    Then I click the save changes button
    Given Then I find the user list page
    When I click on logout link
    And I find the login page
    When I enter username of user1 in username text field
    And I enter new password of user1 in password text field
    And I click the login button
    And I click the user button
    When I click the user2 button
    When I clear the data from password text field
    When I clear the data from confirm password text field
    And I reenter the password for user2 in password text field
    And I reenter the confirm password for user2 in password text field
    Then I click the save changes button
    Given Then I find the user list page
    When I click on logout link
    And I find the login page
    When I enter username of user2 in username text field
    And I enter new password of user2 in password text field
    And I click the login button
    And I click the user button
    When I click the user3 button
    When I clear the data from password text field
    When I clear the data from confirm password text field
    And I reenter the password for user3 in password text field
    And I reenter the confirm password for user3 in password text field
    Then I click the save changes button
    Given Then I find the user list page
    When I click on logout link
    And I find the login page
    When I enter username of user3 in username text field
    And I enter new password of user3 in password text field
    And I click the login button
    And I click on logout link
    When I enter username of user2 in username text field
    And I enter new password of user2 in password text field
    And I click the login button
    And I click the user button
    When I click the user3 button
    And I click the delete user button
    And I click the delete the permanent button
    Given Then I find the user list page
    When I click on logout link
    When I enter username of user1 in username text field
    And I enter new password of user1 in password text field
    And I click the login button
    And I click the user button
    When I click the user2 button
    And I click the delete user button
    And I click the delete the permanent button
    Given Then I find the user list page
    When I click on logout link
    When I enter username in username text field
    And I enter password in password text field
    And I click the login button
    And I click the user button
    When I click the user1 button
    And I click the delete user button
    And I click the delete the permanent button
    Given Then I find the user list page
    When I click on logout link
    And I logout the browser


