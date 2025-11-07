package com.sgtesting.Prgrams;

import com.sgtesting.PomActitime.Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
    private static WebDriver driver;
    private static Pom page;

    public static void main(String[] args) {
        launch();
        navigate();
    }
    private static void launch(){
        try{
driver=new ChromeDriver();
page=new Pom(driver);
driver.get("http://localhost/login.do");
Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void navigate(){
        try{
            page.getUser().sendKeys("vsv");
            page.getPass().sendKeys("2222");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}