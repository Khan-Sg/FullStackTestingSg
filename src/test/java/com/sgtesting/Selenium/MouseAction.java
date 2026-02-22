package com.sgtesting.Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class MouseAction {

    public WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 0)
    public void dragAndDrop() {
        driver.get("https://demoqa.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500);");

        // Navigate to "Interactions" card
        driver.findElement(By.xpath("(//div[@class='card-up'])[5]")).click();

        // Click on "Droppable"
        driver.findElement(By.xpath("//span[text()='Droppable']")).click();

        // Perform Drag and Drop
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(source, target).perform();

        System.out.println("Drag and Drop performed");

        // Wait for the target element to be visible (optional)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("droppable")));
    }

    @Test(priority = 1)
    public void clickCard() {
        driver.get("https://demoqa.com/");
        Actions actions = new Actions(driver);

        // Click on first card
        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]")).click();
        System.out.println("Card clicked");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}