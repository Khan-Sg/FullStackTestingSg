package stepdefinations;

import com.sgtesting.pageobjectmodel.ActiTimePager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class StepDefinations {
    public static WebDriver oBrowser = null;
    public static ActiTimePager oAct = null;

    @Given("^I Launch chrome Browser$")
    public void I_Launch_chrome_Browser() {
        try {

            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();
            oAct = new ActiTimePager(oBrowser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I Navigate the application URL$")
    public void I_Navigate_the_application_URL() {
        try {
            oBrowser.get("http://localhost/login.do");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I find the login page$")
    public void I_find_the_login_page() {
        String expected, actual;
        try {
            expected = "actiTIME - Login";
            actual = oBrowser.getTitle();
            Assert.assertEquals(actual, expected);
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^I enter username in username text field$")
    public void I_enter_username_in_username_text_field() {
        try {
            oAct.getUserName().sendKeys("admin");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @And("^I enter password in password text field$")
    public void I_enter_password_in_password_text_field() {
        try {
            oAct.getPassword().sendKeys("manager");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @When("I enter username in {string} text field")
    public void enterUsername(String username) {
        // Assuming oAct is your Page Object
        oAct.getUserName().sendKeys(username);
    }

    @When("I enter password in {string} text field")
    public void enterPassword(String password) {
        oAct.getPassword().sendKeys(password);
    }

    @And("^I click the login button$")
    public void I_click_the_login_button() {
        try {
            oAct.getLoginButton().click();
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("I find the homePage")
    public void iFindTheHomePage() {
        WebElement oEle = null;
        try {
            oEle = oBrowser.findElement(By.xpath("//td[@class='logoCell navCell']//div[2]//img[1]"));
            Assert.assertTrue(oEle.isDisplayed());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @And("^I minimize the Flyout Window$")
    public void I_minimize_the_Flyout_Window() {
        try {
            oAct.getFlyOutWindow().click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("Then I find the homePage after Login")
    public void thenIFindTheHomePageAfterLogin() {
        WebElement oEle = null;
        try {
            oEle = oBrowser.findElement(By.xpath("//td[@class='logoCell navCell']//div[2]//img[1]"));
            Assert.assertTrue(oEle.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^I click on logout link$")
    public void I_click_on_logout_link() {
        try {
            oBrowser.findElement(By.xpath("//a[@id='logoutLink']")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^I find the login page after logout$")
    public void I_find_the_login_page_after_logout() {
        String expected, actual;
        try {
            expected = "actiTIME - Login";
            actual = oBrowser.getTitle();
            Assert.assertEquals(actual, expected);
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I logout the browser$")
    public void I_logout_the_browser() {
        try {
            oBrowser.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the user button$")
    public void I_click_the_user_button() {
        try {
            oAct.getUsers().click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @When("^I click add user button$")
    public void I_click_add_user_button() {
        try {
            oAct.getCreateUserLink1().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^I enter the Firstname in text field$")
    public void I_enter_the_Firstname_in_text_field() {
        try {
            oAct.writeFirstName().sendKeys("demo");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @And("^I enter the lastname in text field$")
    public void I_enter_the_lastname_in_text_field() {
        try {
            oAct.writeLastName().sendKeys("User1");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter the email in text field$")
    public void I_enter_the_email_in_text_field() {
        try {
            oAct.writeEmailId().sendKeys("user1@gmail.com");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter the username in User text field$")
    public void I_enter_the_username_in_User_text_field() {
        try {
            oAct.writeUserId().sendKeys("demoUser1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter the password in user password text field$")
    public void I_enter_the_password_in_user_password_text_field() {
        try {
            oAct.writePassword().sendKeys("Welcome");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter the confirm password in user password text field$")
    public void I_enter_the_confirm_password_in_user_password_text_field() {
        try {
            oAct.writeConfirmPassword().sendKeys("Welcome");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @And("^I click the create user button$")
    public void I_click_the_create_user_button() {
        try {
            oAct.getCreateUserLink().click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("^Then I find the user list page$")
    public void Then_I_find_the_user_list_page() {
        WebElement oEle = null;
        try {
            oEle = oBrowser.findElement(By.xpath("//span[text()='User List']"));
            Assert.assertTrue(oEle.isDisplayed());
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("I click the user1 button")
    public void I_click_the_user1_button() {
        try {
            oAct.clickUser1().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the delete user button$")
    public void I_click_the_delete_user_button() {
        try {
            oAct.clickDeleteUserButton().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the delete the permanent button$")
    public void I_click_the_delete_the_permanent_button() {
        try {
            Alert oAle = oBrowser.switchTo().alert();
            oAle.accept();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^I clear the data from password text field$")
    public void I_clear_the_data_from_password_text_field() {
        try {
            oAct.writePassword().clear();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^I clear the data from confirm password text field$")
    public void I_clear_the_data_from_confirm_password_text_field() {
        try {
            oAct.writeConfirmPassword().clear();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I reenter the password to password text field$")
    public void I_reenter_the_password_to_password_text_field() {
        try {
            oAct.writePassword().sendKeys("Testing");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I reenter the confirm password to password text field$")
    public void I_reenter_the_confirm_password_to_password_text_field() {
        try {
            oAct.writeConfirmPassword().sendKeys("Testing");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^I click the save changes button$")
    public void I_click_the_save_changes_button() {
        try {
            oAct.getSaveChangesButton().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the Task button$")
    public void I_click_the_Task_button() {
        try {
            oAct.getTask().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("^I find the Customer list page$")
    public void I_find_the_Customer_list_page() {
        WebElement oEle = null;
        try {
            oEle = oBrowser.findElement(By.xpath("//div[text()='Customers & Projects']"));
            Assert.assertTrue(oEle.isDisplayed());
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click Add new button$")
    public void I_click_Add_new_button() {
        try {
            oAct.getAddNewButton().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click New Customer button$")
    public void I_click_New_Customer_button() {
        try {
            oAct.getCreateCustomerButton().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Enter the customer name$")
    public void Enter_the_customer_name() {
        try {
            oAct.writeCustomerName().sendKeys("Manohar");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^Enter customer Description$")
    public void Enter_customer_Description() {
        try {
            oAct.writeCustomerDescription().sendKeys("Imports And Exports");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Click the create customer button$")
    public void Click_the_create_customer_button() {
        try {
            oAct.getClickCustomerButton().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^I click the customer settings button$")
    public void I_click_the_customer_settings_button() {
        try {
            oAct.getEditButtonCustomer().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the Action button$")
    public void I_click_the_Action_button() {
        try {
            oAct.getActionButtonCus().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the delete customer button$")
    public void I_click_the_delete_customer_button() {
        try {
            oAct.getDeleteButtonCus().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the permanently delete button$")
    public void I_click_the_permanently_delete_button() {
        try {
            oAct.getClickConfirmCus().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click New Project button$")
    public void I_click_New_Project_button() {
        try {
            oAct.getCreateProject().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Enter the project Name$")
    public void Enter_the_project_Name() {
        try {
            oAct.writeProjectName().sendKeys("Programmable Devices");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the create project button$")
    public void I_click_the_create_project_button() {
        try {
            oAct.getConfirmProjectButton().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click edit button of project$")
    public void I_click_edit_button_of_project() {
        try {
            oAct.getProjectEditButton().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the Action button of project$")
    public void I_click_the_Action_button_of_project() {
        try {
            oAct.getActionProject().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the delete Project button$")
    public void I_click_the_delete_Project_button() {
        try {
            oAct.getDeleteProject().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the permanently delete button of project$")
    public void I_click_the_permanently_delete_button_of_project() {
        try {
            oAct.clickConfirmDelPro().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^I clear the data from customer description$")
    public void I_clear_the_data_from_customer_description() {
        try {
            oAct.modifyDesCus().clear();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I reenter the data for customer description$")
    public void I_reenter_the_data_for_customer_description() {
        try {
            oAct.modifyDesCus().sendKeys("Hardware And Software Component");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^Enter the project description$")
    public void Enter_the_project_description() {
        try {
            oAct.writeDesPro().sendKeys("System Testing");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^I click on add new task button$")
    public void I_click_on_add_new_task_button() {
        try {
            oAct.getAddTask().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @And("^I click on create new task button$")
    public void I_click_on_create_new_task_button() {
        try {
            oAct.getCreateTask().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^Enter the Task Name$")
    public void Enter_the_Task_Name() {
        try {
            oAct.writeTaskDetails().sendKeys("Software Testing");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^I click on create task button$")
    public void I_click_on_create_task_button() {
        try {
            oAct.clickConfirmTask().click();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the Created Task$")
    public void I_click_the_Created_Task() {
        try {
            oAct.getClickTask().click();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the Action button of Task$")
    public void I_click_the_Action_button_of_Task() {
        try {
            oAct.getActionTask().click();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the Delete Task button$")
    public void I_click_the_Delete_Task_button() {
        try {
            oAct.getDelTask().click();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the Delete confirm Task button$")
    public void I_click_the_Delete_confirm_Task_button() {
        try {
            oAct.getDelConfirmTask().click();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click on import task button$")
    public void I_click_on_import_task_button() {
        try {
            oAct.getImportTask().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click on dropzone button$")
    public void I_click_on_dropzone_button() {
        try {
            oAct.getDropZone().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("^Import the files from the drive$")
    public void Import_the_files_from_the_drive() {
        try {
            String filePath = "D:\\GitQARepository2\\CurrentWorkSpace\\File\\Sample.csv";
            copyFile(filePath);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            Thread.sleep(500);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void copyFile(String filepath) {
        StringSelection strselection = new StringSelection(filepath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
    }

    @Then("^I click add import button$")
    public void I_click_add_import_button() {
        try {
            oAct.getAddImport().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the import close button$")
    public void I_click_the_import_close_button() {
        try {
            oAct.getCloseImport().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click project B2 button$")
    public void I_click_project_B2_button() {
        try {
            oAct.getClickProjectB2().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click project B2 edit button$")
    public void I_click_project_B2_edit_button() {
        try {
            oAct.getEditPB2().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click project B1 button$")
    public void I_click_project_B1_button() {
        try {
            oAct.getClickProjectB1().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^I click project B1 edit button$")
    public void I_click_project_B1_edit_button() {
        try {
            oAct.getEditPB1().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click project A1 button$")
    public void I_click_project_A1_button() {
        try {
            oAct.getClickProjectA1().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^I click project A1 edit button$")
    public void I_click_project_A1_edit_button() {
        try {
            oAct.getEditPA1().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^I enter username of user1 in username text field$")
    public void I_enter_username_of_user1_in_username_text_field() {
        try {
            oAct.getUserName().sendKeys("demoUser1");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter password of user1 in password text field$")
    public void I_enter_password_of_user1_in_password_text_field() {
        try {
            oAct.getPassword().sendKeys("Welcome");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click the skip explorer page button$")
    public void I_click_the_skip_explorer_page_button() {
        try {
            oAct.getSkipExplorePage().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter the lastname of user2 in text field$")
    public void I_enter_the_lastname_of_user2_in_text_field() {
        try {
            oAct.writeLastName().sendKeys("User2");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter the email of user2 in text field$")
    public void I_enter_the_email_of_user2_in_text_field() {
        try {
            oAct.writeEmailId().sendKeys("user2@gmail.com");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter the username of user2 in User text field$")
    public void I_enter_the_username_of_user2_in_User_text_field() {
        try {
            oAct.writeUserId().sendKeys("demoUser2");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter the password of user2 in user password text field$")
    public void I_enter_the_password_of_user2_in_user_password_text_field() {
        try {
            oAct.writePassword().sendKeys("Welcome1");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter the confirm password of user2 in user password text field$")
    public void I_enter_the_confirm_password_of_user2_in_user_password_text_field() {
        try {
            oAct.writeConfirmPassword().sendKeys("Welcome1");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^I enter username of user2 in username text field$")
    public void I_enter_username_of_user2_in_username_text_field() {
        try {
            oAct.getUserName().sendKeys("demoUser2");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter password of user2 in password text field$")
    public void I_enter_password_of_user2_in_password_text_field() {
        try {
            oAct.getPassword().sendKeys("Welcome1");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter the lastname of user3 in text field$")
    public void I_enter_the_lastname_of_user3_in_text_field() {
        try {
            oAct.writeLastName().sendKeys("User3");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I enter the email of user3 in text field$")
    public void I_enter_the_email_of_user3_in_text_field(){
        try {
            oAct.writeEmailId().sendKeys("user3@gmail.com");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I enter the username of user3 in User text field$")
    public void I_enter_the_username_of_user3_in_User_text_field()
    {
        try{
            oAct.writeUserId().sendKeys("demoUser3");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I enter the password of user3 in user password text field$")
    public void I_enter_the_password_of_user3_in_user_password_text_field()
    {
        try{
            oAct.writePassword().sendKeys("Welcome12");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I enter the confirm password of user3 in user password text field$")
    public void I_enter_the_confirm_password_of_user3_in_user_password_text_field()
    {
        try{
            oAct.writeConfirmPassword().sendKeys("Welcome12");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @When("^I enter username of user3 in username text field$")
    public void I_enter_username_of_user3_in_username_text_field()
    {
        try{
            oAct.getUserName().sendKeys("demoUser3");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I enter password of user3 in password text field$")
    public void I_enter_password_of_user3_in_password_text_field()
    {
        try{
            oAct.getPassword().sendKeys("Welcome12");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I enter new password of user1 in password text field$")
    public void I_enter_new_password_of_user1_in_password_text_field()
    {
        try{
            oAct.getPassword().sendKeys("Testing");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I click the user2 button$")
    public void I_click_the_user2_button()
    {
        try{
            oAct.getUsername2().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I reenter the password for user2 in password text field$")
    public void I_reenter_the_password_for_user2_in_password_text_field()
    {
        try{
            oAct.writePassword().sendKeys("Testing1");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I reenter the confirm password for user2 in password text field$")
    public void I_reenter_the_confirm_password_for_user2_in_password_text_field()
    {
        try{
            oAct.writeConfirmPassword().sendKeys("Testing1");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I enter new password of user2 in password text field$")
    public void I_enter_new_password_of_user2_in_password_text_field()
    {
        try{
            oAct.getPassword().sendKeys("Testing1");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I click the user3 button$")
    public void I_click_the_user3_button()
    {
        try{
            oAct.getUsername3().click();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I reenter the password for user3 in password text field$")
    public void I_reenter_the_password_for_user3_in_password_text_field()
    {
        try{
            oAct.writePassword().sendKeys("Testing12");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I reenter the confirm password for user3 in password text field$")
    public void I_reenter_the_confirm_password_for_user3_in_password_text_field()
    {
        try{
            oAct.writeConfirmPassword().sendKeys("Testing12");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^I enter new password of user3 in password text field$")
    public void I_enter_new_password_of_user3_in_password_text_field()
    {
        try{
            oAct.getPassword().sendKeys("Testing12");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
