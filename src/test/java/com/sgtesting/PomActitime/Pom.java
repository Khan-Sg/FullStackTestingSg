package com.sgtesting.PomActitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pom {
public Pom(WebDriver driver)
{
    PageFactory.initElements(driver,this);
}
private WebElement username;
public WebElement getUser(){
    return username;
}
private WebElement pwd;
public WebElement getPass(){
    return pwd;
}
}
