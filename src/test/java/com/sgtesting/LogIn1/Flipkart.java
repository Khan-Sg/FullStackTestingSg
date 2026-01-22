package com.sgtesting.LogIn1;

import com.sgtesting.Pom1.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Flipkart {
    private static WebDriver driver;
    private static Page page;
    public static void main(String[] args) {
        Login();
    }
    private static void Login(){
        try{
            driver=new ChromeDriver();
        page=new Page(driver);
            driver.get("https://www.flipkart.com/");
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element;
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
//            page.getPke_EE().sendKeys("mobiles");
            page.getmobile().click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
