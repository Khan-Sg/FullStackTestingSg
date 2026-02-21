Feature: Create And Delete Both Customer And project And Task
  Scenario:Create And Delete Both the Customer And project And Also Task
    Given I Launch chrome Browser
    And I Navigate the application URL
    And I find the login page
    When I enter username in username text field
    And I enter password in password text field
    And I click the login button
    Then I find the homePage
    And I minimize the Flyout Window
    And I click the Task button
    Given I find the Customer list page
    And I click Add new button
    And I click New Customer button
    Then Enter the customer name
    And Enter customer Description
    Then Click the create customer button
    And I click Add new button
    And I click New Project button
    Then Enter the project Name
    And I click the create project button
    When I click on add new task button
    And I click on create new task button
    And Enter the Task Name
    Then I click on create task button
    And I click the Created Task
    And I click the Action button of Task
    And I click the Delete Task button
    And I click the Delete confirm Task button
    And I click edit button of project
    And I click the Action button of project
    And I click the delete Project button
    And I click the permanently delete button of project
    When I click the customer settings button
    And I click the Action button
    And I click the delete customer button
    And I click the permanently delete button
    Given I find the Customer list page
    When I click on logout link
    Then I find the login page after logout
    And I logout the browser

