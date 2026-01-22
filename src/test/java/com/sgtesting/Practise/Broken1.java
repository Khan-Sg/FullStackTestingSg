package com.sgtesting.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Broken1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chatgpt.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        List<WebElement> link=driver.findElements(By.tagName("a"));
        for(WebElement links:link){
            System.out.println(links.getText()+"---."+links.getAttribute("href"));
            String url=links.getAttribute("href");
            if(url==null||url.isEmpty()){
                System.out.println("skip Empty links");
                continue;
            }try{
                HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();
               int response= conn.getResponseCode();
               if(response>=400){
                   System.out.println(url+"Broken link"+response);
               }else{
                   System.out.println(url+"valid link"+response);
               }
            } catch (Exception e) {
                System.out.println(url+"error"+e.getMessage());
            }
        }driver.quit();
    }
}
