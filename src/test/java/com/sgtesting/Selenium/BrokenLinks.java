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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        List<WebElement> link = driver.findElements(By.tagName("a"));
        for (WebElement links : link) {
            System.out.println(links.getText() + "---->" + links.getAttribute("href"));
            String url = links.getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println("Empty links");
            }
            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.getHeaderField("HEAD");
                conn.connect();
                int response = conn.getResponseCode();
                if (response >= 400) {
                    System.out.println(url + "velid link " + response);
                } else {
                    System.out.println(url + "Broken link link " + response);
                }
            } catch (Exception e) {
                System.out.println(url + "velid link " + e.getMessage());
            }
        }
    }
}