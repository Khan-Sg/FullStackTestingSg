package com.sgtesting.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AllLinks1 {
    @Test(enabled = true)
    private void Links(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://chatgpt.com/");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for(WebElement alllinks:links){
            System.out.println(alllinks.getAttribute("href")+"---->"+alllinks.getText());
        }
    }
}
