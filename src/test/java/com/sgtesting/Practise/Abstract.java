package com.sgtesting.Practise;
abstract class Geometry{
    abstract void area();
}
class Rectangle extends Geometry{
    int l=10,b=2;
    void area(){
        int area=l*b;
        System.out.println("Area of rectangle is :"+area);
    }
}
class Square extends Geometry{
    int l=10;
    void area(){
        int area=l*l;
        System.out.println("Area of Square is :"+area);
    }
}
class Triangle extends Geometry{
    double l=10,h=7;
    void area(){
        double area=.5*l*h;
        System.out.println("Area of Triangle is :"+area);
    }
}
public class Abstract {
    public static void main(String[] args) {
        Geometry g=new Square();
        g.area();
        Geometry g1=new Rectangle();
        g1.area();
        Geometry g2=new Triangle();
        g2.area();

    }
}
