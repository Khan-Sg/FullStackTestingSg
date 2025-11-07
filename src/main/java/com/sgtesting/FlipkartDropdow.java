package com.sgtesting;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FlipkartDropdow {
    private static WebDriver element;
    public static void main(String[] args) {
        navigate();
        Drop();
        end();
    }
    private static void navigate(){
        element=new ChromeDriver();
        element.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        element.manage().window().maximize();
    }

private static void Drop(){

        try{
            Thread.sleep(2000);

            WebElement countryDropdown = element.findElement(By.xpath("//select"));
            Select select = new Select(countryDropdown);
            select.selectByVisibleText("American Samoa");  // or byValue("ALB")
            WebElement selectedoption=select.getFirstSelectedOption();
            String str=selectedoption.getText();
            System.out.println(str);
            String expectedCou="American Samoa";
if(str.equals(("American Samoa"))){
    System.out.println("Passed");
}else{
    System.out.println("not found");
}


        } catch (Exception e) {
            e.printStackTrace();
        }
}
private static void end() {

    element.quit();
}

}
