package com.sgtesting.Practise;

import org.testng.Assert;
import org.testng.annotations.*;

public class Testng {
    @BeforeSuite
    public void bsuit(){
        System.out.println("before suite");
    }
    @AfterSuite
    public void aSuite() {
        System.out.println("After suite");
    }
    @BeforeClass
    public void Bclass() {
        System.out.println("Before class");
    }
    @BeforeClass
    public void Bcass() {
        System.out.println("second before class");
    }
    @AfterClass
    public void Aclass() {
        System.out.println("After class");
    }
    @BeforeMethod
    public void Bmet() {
        System.out.println("before1 method");
    }
    @BeforeMethod
    public void met2(){
        System.out.println("method 2");
    }
    @AfterMethod
    public void methodName() {
        System.out.println("after method");
    }
@AfterSuite
public void s2() {
    System.out.println("2");
}
    @BeforeSuite
    public void ss(){
        System.out.println("22");
    }
    @Test
    public void tes1() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");

    }

}
