package com.sgtesting.Pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
    public Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    private WebElement q;
    public WebElement getPke_EE(){
        return q;
    }
    @FindBy(xpath = "//span[text()='Mobiles & Tablets']")
    private WebElement mobile;
    public WebElement getmobile(){
        return mobile;
    }
}
