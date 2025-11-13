package com.sgtesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class LinksAmazon {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        List<WebElement> list=driver.findElements(By.tagName("a"));
        for(WebElement lists:list){
            System.out.println(lists.getText()+"-->"+lists.getAttribute("href"));

        }
        driver.quit();
    }
}
