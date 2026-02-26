package com.sgtesting.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class getAllfromOptions {
    @Test
    private static void selectDropdown(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://demoqa.com");
        JavascriptExecutor jsm=(JavascriptExecutor) driver;
        jsm.executeScript("window.scrollBy(0, 500)");
        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[4]")).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Menu']")));
//        JavascriptExecutor js1=(JavascriptExecutor) driver;
//        js1.executeScript("window.scrollBy(0, -500)");
//        WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(6));
//        WebElement element1=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='css-19bb58m'])[1]")));
//        Select select=new Select(element1);
//        List<WebElement> elementList=select.getOptions();
//        for(WebElement elementlis:elementList){
//            System.out.println(elementlis.getText());
        }


}
