package com.sgtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FlipkartLoginInvaidCre {
    private static WebDriver driver;
    public static void main(String[] args) {
        navigate();
        LogInvalid();
    }
    private static void navigate(){
        driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/");
       driver.manage().window().maximize();
    }
    private static void LogInvalid(){
        try{
            WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
            Thread.sleep(2000);
Actions action=new Actions(driver);
Thread.sleep(2000);
        action.moveToElement(element).build().perform();
        Thread.sleep(1000);
            WebElement womenEthnic=driver.findElement(By.linkText("Women Ethnic"));
            action.moveToElement(womenEthnic).build().perform();
            Thread.sleep(2000);
         WebElement WomenSarees=driver.findElement(By.linkText("Women Sarees"));
         action.moveToElement(WomenSarees).build().perform();
         WebElement Electronics=driver.findElement(By.linkText("Electronics"));
         action.moveToElement(Electronics).build().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
