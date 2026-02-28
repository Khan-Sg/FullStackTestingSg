package com.sgtesting.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class FlipkartDraganddrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//span[@role='button']")).click();//(//a[@title='Become a Seller'])[2]

        WebElement drag=driver.findElement(By.xpath("(//img[@class='QD1LBt RK3V3u'])[2]"));
        WebElement drop=driver.findElement(By.xpath("(//a[@title='Become a Seller'])[2]"));
        Actions actions=new Actions(driver);
//        actions.click(drag).perform();
        actions.dragAndDrop(drag,drop).click(drop).perform();
//        actions.click(drop).perform();
    }
}
