package com.sgtesting.PomActitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
   public Pom1(WebDriver driver){
       PageFactory.initElements(driver,this);
    }
private WebElement twotabsearchtextbox;
   public WebElement getTwotabsearchtextbox(){
       return twotabsearchtextbox;
   }
   private WebElement navinput;
   public WebElement getSearchikon(){
       return navinput;
   }

//@FindBy(xpath = "//input[@id='nav-search-submit-button']")
//    private WebElement SearchIcon;
//   public WebElement getSearchIcon(){
//       return  SearchIcon;
//    }
@FindBy(id = "nav-search-submit-button")
private WebElement searchIcon;

    public WebElement getSearchIcon() {
        return searchIcon;
    }
}
