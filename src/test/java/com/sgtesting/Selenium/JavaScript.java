package com.sgtesting.Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

public class JavaScript {
    public static void main(String[] args) throws InterruptedException {

        // Set up WebDriver (make sure ChromeDriver is in PATH)
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open a website (example site)
        driver.get("https://www.w3schools.com/html/html_forms.asp");

        // Cast WebDriver instance to JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 400 pixels
        js.executeScript("window.scrollBy(0, 400);");
        Thread.sleep(1000);

        // Locate input elements
        WebElement firstName = driver.findElement(By.id("fname"));
        WebElement lastName = driver.findElement(By.id("lname"));

        // Set value in input fields using JavaScript
        js.executeScript("arguments[0].value='John';", firstName);
        js.executeScript("arguments[0].value='Doe';", lastName);

        // Highlight both fields using JavaScript
        js.executeScript("arguments[0].style.border='3px solid red'", firstName);
        js.executeScript("arguments[0].style.border='3px solid red'", lastName);
        Thread.sleep(1000);

        // Scroll to the submit button
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        Thread.sleep(1000);

        // Click submit using JavaScript
        js.executeScript("arguments[0].click();", submitButton);

        // Get page title and URL using JavaScript
        String title = (String) js.executeScript("return document.title;");
        String url = (String) js.executeScript("return document.URL;");

        System.out.println("✅ Page Title: " + title);
        System.out.println("🌐 Page URL: " + url);

        // Scroll to top using JavaScript
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(2000);

        // Close browser
        driver.quit();
    }
}
