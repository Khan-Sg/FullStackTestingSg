package com.sgtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Assertion {
    public static  WebDriver driver;
    public static void main(String[] args) {
        launch();
    }
    private static void launch(){
        try{
          driver =new ChromeDriver();
          driver.manage().window().maximize();
            driver.get("https://www.flipkart.com/");
            String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch!");

            // ✅ Example 2: Verify URL
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("flipkart"), "URL does not contain 'flipkart'");

            System.out.println("All assertions passed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
