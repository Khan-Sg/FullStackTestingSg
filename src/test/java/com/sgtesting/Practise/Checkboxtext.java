package com.sgtesting.Practise;

import io.cucumber.java.an.E;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Checkboxtext {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sreenidhirajakrishnan.com/practice?utm_source=sp_auto_dm&utm_referrer=sp_auto_dm&fbclid=PAT01DUASoUCVleHRuA2FlbQIxMABzcnRjBmFwcF9pZA81NjcwNjczNDMzNTI0MjcAAafOFR62E0n2gJLtBdNGyxR_xTTOkrRxBt0KTkGPmMhJRa28-1WP4YJwDCZi1w_aem_6bRr4yGT1C3nbgotj8x02w");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement element=driver.findElement(By.xpath("//section[@id='section-3']"));
      String che= element.getText();
        System.out.println(che);
        driver.close();
//        driver.findElement(By.xpath("//button[@id='confirm-btn']")).click();
//Alert alert=driver.switchTo().alert();
//String al=alert.getText();
//        System.out.println(al);
//        alert.accept();
//        driver.close();
    }
}
