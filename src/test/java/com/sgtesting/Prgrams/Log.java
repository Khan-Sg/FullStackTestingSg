package com.sgtesting.Prgrams;

import com.sgtesting.PomActitime.Pom1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log {
    private static WebDriver driver;
    private static Pom1 page;
    public static void main(String[] args) {
        navigate();
        amazonLog();
    }
    private static void navigate(){
        driver=new ChromeDriver();
        page=new Pom1(driver);

    }
    private static void amazonLog(){
        try{
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=2488751684357543575&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
page.getTwotabsearchtextbox().sendKeys("mobiles");
            Thread.sleep(1000);
page.getSearchIcon().click();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
