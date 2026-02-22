package com.sgtesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Amazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\path\\to\\geckodriver.exe");

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=16050277904838026796&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062029&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
        List<WebElement> elements=driver.findElements(By.tagName("a"));
        for(WebElement elemnt:elements){
            System.out.println(elemnt.getText()+" "+ elemnt.getAttribute("href"));
        }
    }
}
