package com.sgtesting;

class Over {
    int add(int a, int b) {
        return a + b;
    }

    double add( double x,  double b) {
        return x - b;
    }

  int add(short x, short y) {
        return x / y;
    }
}
class E1{
    public static void main(String[] args) {
Over o=new Over();
        System.out.println("addition is "+o.add(20,2));
        System.out.println("substtract is :"+o.add(20,1));
    }

}
