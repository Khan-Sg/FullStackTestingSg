package com.sgtesting.Practise;

import com.sgtesting.Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WindowHandel1 {
    public WebDriver driver = null;

    @Test(enabled = false)
    private void Windoes() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.leafground.com/window.xhtml");
        String parentWindow = driver.getWindowHandle();
        System.out.println("parentWindow :" + parentWindow);
        driver.findElement(By.xpath("//span[text()='Open']")).click();
        Set<String> childwindows = driver.getWindowHandles();
        for (String childwindow : childwindows) {
            if (!parentWindow.equals(childwindow)) {
                driver.switchTo().window(childwindow);
                System.out.println(driver.getTitle() + childwindow);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("After switcvhing parentWindow :" + parentWindow);
        driver.quit();
    }

    @Test(enabled = false)
    private void AnothtExe() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html?utm_source=chatgpt.com");
        String parentWindow = driver.getWindowHandle();
        System.out.println("parentWindow :" + parentWindow + driver.getTitle());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        driver.findElement(By.xpath("(//button[@class='whButtons'])[1]")).click();
        Set<String> allWindow = driver.getWindowHandles();
        for (String allWindows : allWindow) {
            if (!allWindows.equals(parentWindow

            )) {
                System.out.println("child browser :" + allWindows);
                driver.switchTo().window(allWindows);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("Last window handle" + driver.getTitle());
        driver.quit();
    }

    @Test(enabled = false)
    private void Links() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://chatgpt.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement alllinks : links) {
            System.out.println(alllinks.getAttribute("href") + "---->" + alllinks.getText());
        }
        driver.quit();
    }

    @Test(enabled = false)
    private void AllBroken() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.google.com");
        List<WebElement> link = driver.findElements(By.tagName("a"));
        for (WebElement links : link) {
            System.out.println(links.getAttribute("href") + "---->" + links.getText());
            String url = links.getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println("empty Links");
            }
try{
 HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
 conn.setRequestMethod("HEAD");
 conn.connect();
 int response=conn.getResponseCode();
 if(response>=400){
     System.out.println(url+"Invalid Link"+response);
 }else{
     System.out.println(url+"Valid Link"+response);
 }
} catch (Exception e) {
    System.out.println("exception"+e.getMessage());
}
        }
    }
    @Test(enabled = false)
    private void Assertion()
    {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
     try{
         String expected1="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
         String actual1=driver.getTitle();

         SoftAssert soft=new SoftAssert();
         soft.assertEquals(expected1,actual1,"matched");
       String expected="Online hopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
       String actual=driver.getTitle();
 Assert.assertEquals(expected,actual,"matched");

     } catch (Exception e) {
         e.printStackTrace();
     }

    }
    @Test(enabled = false)
    private void factorial(){
        int n=5,fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }System.out.print(fact);
    }
    @Test(enabled = false)
    private  void Fibonacci(){
        int f=0,s=1,num=9;
        System.out.print(f+","+s);
        for(int i=2;i<=num;i++){
            int t=f+s;
            f=s;
            s=t;
            System.out.print(","+t);
        }
    }
    @Test(enabled = false)
    private static void Links1(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        List<WebElement> link=driver.findElements(By.tagName("a"));
        for(WebElement links:link){
//            System.out.println(links.getText()+"--->"+links.getAttribute("href"));
            String url=links.getAttribute("href");
            if(url==null||url.isEmpty()){
                System.out.println("Empty link");
            }
            try{
             HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
             conn.setRequestMethod("HEAD");
             conn.connect();
             int response= conn.getResponseCode();
             if(response>=400){
                 System.out.println(url+"Invalid Link"+response);
             }else{
                 System.out.println(url+"Valid Link"+response);
             }
            } catch (Exception e) {
                System.out.println("Broken link"+e.getMessage());
            }
        }
    }
    @Test(enabled = true)
    public void url() {
        try {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://chatgpt.com");
String s=driver.getCurrentUrl();
            System.out.println("Current URL is: " +s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

