package com.sgtesting.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PageTitleandLength {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            driver.navigate().to("https://chatgpt.com/");
           String title= driver.getTitle();
            System.out.println(title);
            System.out.println(title.length());
            System.out.println(driver.getPageSource().length());//pagesource is all dom element in page from<htlm> to last<last element>

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
