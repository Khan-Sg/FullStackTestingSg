package com.sgtesting.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeNew {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chatgpt-2025-916-233-0.msixbundle");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chatgpt.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
}
