package com.sgtesting.Practise;
class Rum{
    int addition(int a,int b){
        return a+b;
    }
    int addition(int a,int b,int c){
        return a+b+c;
    }
    double addition(double a,double b,double c){
        return a+b+c;
    }
}
public class AbstractCompile {
    public static void main(String[] args) {
       Rum t=new Rum();
        System.out.println("Addition is :"+t.addition(1,2));
        System.out.println("Addition three is :"+t.addition(2,3,4));
        System.out.println("Double :"+t.addition(1.0,2.0,3.0));
    }
}
