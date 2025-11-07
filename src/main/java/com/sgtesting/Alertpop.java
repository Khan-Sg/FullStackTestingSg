package com.sgtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alertpop {
    private static WebDriver driver;
    public static void main(String[] args) {
        launc();
        alertHandel();
    }
   private static void launc(){
        driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();
   }
   private static void alertHandel(){
        try{
            driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
           String str=driver.switchTo().alert().getText();
            System.out.println(str);
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
            driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().sendKeys("Automation Testing raki");
            Thread.sleep(1000);

            String str1 = driver.switchTo().alert().getText();
            System.out.println("Prompt Alert Text: " + str1);

            driver.switchTo().alert().accept(); // ✅ Accept the prompt alert before closing

//            driver.findElement(By.xpath("//a[contains(text(),'Alert with OK')]")).click();
//           driver.findElement(By.xpath("(//button[contains(@class,'btn btn-success navbar-toggle')])")).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        driver.close();
   }

}
