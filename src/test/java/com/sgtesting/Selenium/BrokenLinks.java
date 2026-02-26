package com.sgtesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String url = link.getAttribute("href");
            String text = link.getText();

            System.out.println(text + " ----> " + url);

            if (url == null || url.isEmpty()) {
                System.out.println("Empty link");
                continue; // skip to next link
            }

            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();

                int response = conn.getResponseCode();
                if (response >= 400) {
                    System.out.println(url + " ----> Broken link, Response code: " + response);
                } else {
                    System.out.println(url + " ----> Valid link, Response code: " + response);
                }

                conn.disconnect(); // close connection
            } catch (Exception e) {
                System.out.println(url + " ----> Exception: " + e.getMessage());
            }
        }

        driver.quit();
    }
}