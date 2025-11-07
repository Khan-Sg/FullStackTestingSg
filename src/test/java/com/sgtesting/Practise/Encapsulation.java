package com.sgtesting.Practise;
public class Encapsulation {
    private double balance;
    public void Deposite(double amount){
        if(amount>0) {
            balance += amount;
            System.out.println("Deposite amount is :" + amount);
            System.out.println("Balance amount is :" + balance);
        }else{
            System.out.println("Invalid amount");
        }
    }
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal amount is :" + amount);
            System.out.println("Balance amount is :" + balance);
        }else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
      Encapsulation en=new Encapsulation();
      en.Deposite(1000);
      en.withdrawal(20);
        System.out.println("Current Balance is :"+en.getBalance());
    }
}
