package com.sgtesting;
    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windowhandel {
        public static void main(String[] args) throws InterruptedException {

            // Initialize Chrome WebDriver
            WebDriver driver = new ChromeDriver();

            // Open a website
            driver.get("https://www.google.com");
            driver.manage().window().maximize();

            // Get the current window handle (unique ID for this browser window)
            String windowID = driver.getWindowHandle();

            // Print the window handle
            System.out.println("Current Window Handle: " + windowID);

            // Wait a bit to see the browser
            Thread.sleep(2000);

            // Close the browser
            driver.quit();
        }
    }


