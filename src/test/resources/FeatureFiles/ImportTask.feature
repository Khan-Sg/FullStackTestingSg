Feature: Import Tasks
  Scenario:Import tasks from drive
    Given I Launch chrome Browser
    And I Navigate the application URL
    And I find the login page
    When I enter username in username text field
    And I enter password in password text field
    And I click the login button
    Then I find the homePage
    And I minimize the Flyout Window
    And I click the Task button
    When I click on add new task button
    And I click on import task button
    And I click on dropzone button
    Given Import the files from the drive
    Then I click add import button
    And I click the import close button
    And I click the Created Task
    And I click the Action button of Task
    And I click the Delete Task button
    And I click the Delete confirm Task button
    And I click the Created Task
    And I click the Action button of Task
    And I click the Delete Task button
    And I click the Delete confirm Task button
    And I click the Created Task
    And I click the Action button of Task
    And I click the Delete Task button
    And I click the Delete confirm Task button
    And I click the Created Task
    And I click the Action button of Task
    And I click the Delete Task button
    And I click the Delete confirm Task button
    And I click project B2 button
    Then I click project B2 edit button
    And I click the Action button of project
    And I click the delete Project button
    And I click the permanently delete button of project
    And I click project B1 button
    Then I click project B1 edit button
    And I click the Action button of project
    And I click the delete Project button
    And I click the permanently delete button of project
    And I click project A1 button
    Then I click project A1 edit button
    And I click the Action button of project
    And I click the delete Project button
    And I click the permanently delete button of project
    When I click on logout link
    Then I find the login page after logout
    And I logout the browser
