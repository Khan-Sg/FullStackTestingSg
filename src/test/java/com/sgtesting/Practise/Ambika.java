package com.sgtesting.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ambika {
    WebDriver driver = new ChromeDriver();

    @Test
    private void ambikaMethod1() {
        try {

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
            driver.get("http://ambicaaspot.com/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    private void ambikaMethod2() {
        try {
            driver.findElement(By.xpath("//span[@class='close']")).click();
            driver.findElement(By.xpath("//a[contains(@href,'http://www.ambicaadigi.in')]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
