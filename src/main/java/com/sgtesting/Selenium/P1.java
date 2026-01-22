package com.sgtesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class P1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// 1. Go to Flipkart
        driver.navigate().to("https://www.flipkart.com/");

// Close popup using wait
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button._2KpZ6l._2doB4z"))).click();
        } catch (Exception e) { }

// 2. Go to Amazon
        driver.navigate().to("https://www.amazon.in/");

// Wait for search box
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));

// 3. Back to Flipkart
        driver.navigate().back();

// Wait for logo
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("img[title='Flipkart']")));

// 4. Refresh
        driver.navigate().refresh();

        driver.quit();

    }
}
