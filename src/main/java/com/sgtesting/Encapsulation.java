package com.sgtesting;

public class Encapsulation {
    private double balance;
    public void deposite(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposite amount is :"+amount);
            System.out.println("Balance amount is :"+balance);
        }
    }
    public void withdrawal(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("withdrawal amount is :"+amount);
            System.out.println("Balance amount is :"+balance);
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        Encapsulation en=new Encapsulation();
        en.deposite(1000);
        en.withdrawal(200);
        System.out.println("Current Balance is"+en.getBalance());
    }
}
