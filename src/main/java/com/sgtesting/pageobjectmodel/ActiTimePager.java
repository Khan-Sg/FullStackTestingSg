package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActiTimePager {
    public ActiTimePager(WebDriver oBrowser)
    {
        PageFactory.initElements(oBrowser, this);
    }
    private WebElement username;
    public WebElement getUserName()
    {
        return username;
    }

    //Password text field in Login Page
    private WebElement pwd;
    public WebElement getPassword()
    {
        return pwd;
    }


    @FindBy(xpath = "//div[text()='Login ']")
    private WebElement oLoginBtn;
    public WebElement getLoginButton()
    {

        return oLoginBtn;
    }


    private WebElement gettingStartedShortcutsPanelId;
    public WebElement getFlyOutWindow()
    {
        return gettingStartedShortcutsPanelId;
    }

    @FindBy(linkText = "Logout")
    private WebElement oLogoutLink;
    public WebElement getLogoutLink()
    {
        return oLogoutLink;
    }
    @FindBy(xpath = "//div[normalize-space()='USERS']")
    private WebElement oUsers;
    public WebElement getUsers()
    {
        return oUsers;
    }
    @FindBy(xpath = "//div[@class='buttonText']")
    private WebElement oCreateUser;
    public WebElement getCreateUserLink1()
    {
        return oCreateUser;
    }
   private WebElement firstName;
    public WebElement writeFirstName()
    {
        return firstName;
    }
    private WebElement lastName;
    public  WebElement writeLastName()
    {
        return lastName;
    }
    private WebElement email;
    public  WebElement writeEmailId()
    {
        return email;
    }
    private WebElement userDataLightBox_usernameField;
    public  WebElement writeUserId()
    {
        return userDataLightBox_usernameField;
    }
    private WebElement userDataLightBox_passwordField;
    public  WebElement writePassword()
    {
        return userDataLightBox_passwordField;
    }
    private WebElement passwordCopy;
    public  WebElement writeConfirmPassword()
    {
        return passwordCopy;
    }
    @FindBy(xpath = "//div[@id='userDataLightBox_commitBtn']//div[@class='buttonIcon']")
    private WebElement oCreateUserLink;
    public WebElement getCreateUserLink()
    {
        return oCreateUserLink;
    }
    @FindBy(xpath = "//span[normalize-space()='User1, demo']")
    private WebElement oClickUser1;
    public WebElement clickUser1()
    {
        return oClickUser1;
    }
    private WebElement userDataLightBox_deleteBtn;
    public WebElement clickDeleteUserButton()
    {
        return userDataLightBox_deleteBtn;
    }
    @FindBy(linkText = "Logout")
    private WebElement oLogout;
    public WebElement getLogout()
    {
        return oLogout;
    }
    @FindBy(xpath = "//span[normalize-space()='Save Changes']")
    private WebElement oSaveChangesButton;
    public WebElement getSaveChangesButton()
    {
        return oSaveChangesButton;
    }
    @FindBy(xpath = "//div[normalize-space()='TASKS']")
    private WebElement oTask;
    public WebElement getTask()
    {
        return oTask;
    }
    @FindBy(xpath = "//div[@class='title ellipsis'][normalize-space()='Add New']")
    private WebElement oAddNewCustomer;
    public WebElement getAddNewButton()
    {
        return oAddNewCustomer;
    }
    @FindBy(xpath = "//div[@class='item createNewCustomer ellipsis']")
    private WebElement oCreateCustomer;
    public WebElement getCreateCustomerButton()
    {
        return oCreateCustomer;
    }
    private WebElement customerLightBox_nameField;
    public WebElement writeCustomerName()
    {
        return customerLightBox_nameField;
    }
    private WebElement customerLightBox_descriptionField;
    public WebElement writeCustomerDescription()
    {
        return customerLightBox_descriptionField;
    }
    @FindBy(xpath = "//span[normalize-space()='Create Customer']")
    private WebElement oClickCustomerButton;
    public WebElement getClickCustomerButton()
    {
        return oClickCustomerButton;
    }
    @FindBy(xpath = "//div[@class='editButton available']")
    private WebElement oEditCus;
    public WebElement getEditButtonCustomer()
    {
        return oEditCus;
    }
    @FindBy(xpath = "//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='action'][normalize-space()='ACTIONS']")
    private WebElement oActionCus;
    public WebElement getActionButtonCus()
    {
        return oActionCus;
    }
    @FindBy(xpath = "//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='title'][normalize-space()='Delete']")
    private WebElement oDeleteCus;
    public WebElement getDeleteButtonCus()
    {
        return oDeleteCus;
    }
    @FindBy(xpath = "//div[@id='customerPanel_deleteConfirm_submitBtn']//div[@class='buttonIcon']")
    private WebElement oClickConfirm;
    public WebElement  getClickConfirmCus()
    {
        return oClickConfirm;
    }
    @FindBy(xpath = "//textarea[@placeholder='Enter customer description...']")
    private WebElement oDescCus;
    public WebElement modifyDesCus()
    {
        return oDescCus;
    }
    @FindBy(xpath = "//div[@class='item createNewProject ellipsis']")
    private WebElement oCreateProjectButton;
    public WebElement getCreateProject()
    {
        return oCreateProjectButton;
    }
    private WebElement projectPopup_projectNameField;
    public WebElement writeProjectName()
    {
        return projectPopup_projectNameField;
    }
    @FindBy(xpath = "//span[normalize-space()='Create Project']")
    private WebElement oCreateProject;
    public WebElement getConfirmProjectButton()
    {
        return oCreateProject;
    }
    @FindBy(xpath ="//div[@class='node projectNode selected']//div[@class='editButton available']")
    private WebElement oProjectEdit;
    public WebElement getProjectEditButton()
    {
        return oProjectEdit;
    }
    @FindBy(xpath = "//div[@class='editProjectPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']")
  private WebElement oActionProject;
    public WebElement getActionProject()
    {
        return oActionProject;
    }
    @FindBy(xpath = "//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='title'][normalize-space()='Delete']")
    private WebElement oDeleteProject;
    public WebElement getDeleteProject()
    {
        return oDeleteProject;
    }
    private WebElement projectPanel_deleteConfirm_submitTitle;
    public WebElement clickConfirmDelPro()
    {
        return projectPanel_deleteConfirm_submitTitle;
    }
    @FindBy(xpath = "//textarea[@placeholder='Enter project description...']")
    private WebElement oDesPro;
    public WebElement writeDesPro()
    {
        return oDesPro;
    }
    @FindBy(xpath = "//div[@class='unfilteredContainer']//div[@class='scrollView scrollableContainer']")
    private WebElement oTaskClick;
    public WebElement getTaskClick()
    {
        return oTaskClick;
    }
    @FindBy(xpath = "//div[text()='Add New Task']")
    private WebElement oAddTask;
    public WebElement getAddTask()
    {
        return oAddTask;
    }
    @FindBy(xpath = "//div[@class='item createNewTask ellipsis']")
    private WebElement oCreateTask;
    public WebElement getCreateTask()
    {
        return oCreateTask;
    }
    @FindBy(xpath = "//body[1]/div[8]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
    private WebElement oWriteTask;
    public WebElement writeTaskDetails()
    {
        return oWriteTask;
    }
    @FindBy(xpath = "//div[@id='createTasksPopup_commitBtn']//div[@class='buttonIcon']")
    private WebElement oConfirmCreate;
    public WebElement clickConfirmTask()
    {
        return oConfirmCreate;
    }
    @FindBy(xpath = "//tr[@class='taskRow noLastTrackingDate']//td[@class='names']")
    private WebElement oClickOnTask;
    public WebElement getClickTask()
    {
        return oClickOnTask;
    }
    @FindBy(xpath = "//div[@class='header']//div[@class='action'][normalize-space()='ACTIONS']")
    private WebElement oActionTask;
    public WebElement getActionTask() {
        return oActionTask;
    }
    @FindBy(xpath = "//div[@class='edit_task_sliding_panel sliding_panel']//div[@class='title'][normalize-space()='Delete']")
    private WebElement oDelTask;
    public WebElement getDelTask()
    {
        return oDelTask;
    }
    private WebElement taskPanel_deleteConfirm_submitTitle;
    public WebElement getDelConfirmTask()
    {
        return taskPanel_deleteConfirm_submitTitle;
    }
    @FindBy(xpath = "//span[@class='startExploringText']")
    private WebElement oSkipPage;
    public WebElement getSkipExplorePage()
    {
        return oSkipPage;
    }
    @FindBy(xpath = "//span[normalize-space()='User2, demo']")
    private WebElement oClickUser2;
    public WebElement getUsername2()
    {
        return oClickUser2;
    }
    @FindBy(xpath = "//span[normalize-space()='User3, demo']")
    private WebElement oClickUser3;
    public WebElement getUsername3()
    {
        return oClickUser3;
    }
    @FindBy(xpath = "//span[normalize-space()='Save Changes']")
    private WebElement oSaveChange;
    public WebElement getSaveChange()
    {
        return oSaveChange;
    }
    @FindBy(xpath = "//div[@class='item importTasks ellipsis']")
    private WebElement oImportTask;
    public WebElement getImportTask()
    {
        return oImportTask;
    }
    private WebElement dropzoneClickableArea;
    public WebElement getDropZone()
    {
        return dropzoneClickableArea;
    }
    @FindBy(xpath = "//span[@class='buttonTitle']")
    private WebElement oAddImport;
    public WebElement getAddImport()
    {
        return oAddImport;
    }
    @FindBy(xpath = "//div[@id='closeLoadTasksFromCSVPopupButton']")
    private WebElement oCloseImport;
    public WebElement getCloseImport()
    {
        return oCloseImport;
    }
    @FindBy(xpath = "(//div[@class='title'])[6]")
    private WebElement oClickProjectB2;
    public WebElement getClickProjectB2()
    {
        return oClickProjectB2;
    }
    @FindBy(xpath = "(//div[@class='editButton available'])[5]")
    private WebElement oEditPB2;
    public WebElement getEditPB2()
    {
        return oEditPB2;
    }
    @FindBy(xpath = "(//div[@class='title'])[5]")
    private WebElement oClickProjectB1;
    public WebElement getClickProjectB1()
    {
        return  oClickProjectB1;
    }
    @FindBy(xpath = "(//div[@class='editButton available'])[4]")
    private WebElement oEditPB1;
    public WebElement getEditPB1()
    {
        return  oEditPB1;
    }
    @FindBy(xpath = "(//div[@class='title'])[3]")
    private WebElement oClickProjectA1;
    public WebElement getClickProjectA1()
    {
        return oClickProjectA1;
    }
    @FindBy(xpath = "(//div[@class='editButton available'])[2]")
    private WebElement oEditPA1;
    public WebElement getEditPA1()
    {
        return oEditPA1;
    }

}
