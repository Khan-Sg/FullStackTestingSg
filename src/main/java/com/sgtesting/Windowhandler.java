package com.sgtesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

    public class Windowhandler {

        public static void main(String[] args) throws InterruptedException {

            // Set up WebDriver (Make sure ChromeDriver path is set in your system)
            WebDriver driver = new ChromeDriver();

            // Open a sample site
            driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
            Thread.sleep(2000);
            driver.manage().window().maximize();

            // Store the ID of the main window
            String mainWindow = driver.getWindowHandle();
            System.out.println("Main Window Handle: " + mainWindow);

            // Switch to iframe (on W3Schools page, the button is inside an iframe)
            driver.switchTo().frame("iframeResult");

            // Click the button that opens a new window
            driver.findElement(By.tagName("button")).click();

            // Get all window handles
            Set<String> allWindows = driver.getWindowHandles();

            // Iterate through windows
            for (String windowHandle : allWindows) {
                if (!windowHandle.equals(mainWindow)) {
                    // Switch to new window
                    driver.switchTo().window(windowHandle);
                    System.out.println("Switched to new window: " + driver.getTitle());

                    // Wait to see the new window
                    Thread.sleep(2000);

                    // Close the new window
                    driver.close();
                    System.out.println("New window closed.");
                }
            }

            // Switch back to main window
            driver.switchTo().window(mainWindow);
            System.out.println("Back to main window: " + driver.getTitle());

            // Quit browser
            driver.quit();
        }
    }


