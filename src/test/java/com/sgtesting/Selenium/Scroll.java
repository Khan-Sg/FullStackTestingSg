package com.sgtesting.Selenium;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Scroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
Thread.sleep(1000);
        driver.get(" https://www.w3schools.com/html/html_forms.asp");
        JavascriptExecutor js=(JavascriptExecutor) driver;

// Scroll down by 400 pixels
        js.executeScript("window.scrollBy(0, 400);");

js.executeScript("window.scrollBy(0,1200)");
        // Scroll further down
        js.executeScript("window.scrollBy(0, 800);");
        Thread.sleep(2000);

        // Scroll back up
        js.executeScript("window.scrollBy(0, -400);");


        driver.quit();
    }
}
