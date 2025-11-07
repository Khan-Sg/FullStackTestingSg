package com.sgtesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windowhandlers {

    public static void main(String[] args) throws InterruptedException {

        // Initialize Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the first website
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
        driver.manage().window().maximize();

        // Switch to iframe to access the button
        driver.switchTo().frame("iframeResult");

        // Click button that opens a new window
        driver.findElement(By.tagName("button")).click();

        // Wait a moment for the new window to open
        Thread.sleep(2000);

        // Get all open window handles
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Print all window handles
        System.out.println("All Window Handles:");
        for (String handle : allWindowHandles) {
            System.out.println(handle);
        }

        // Close all browser windows
        driver.quit();
    }


}
