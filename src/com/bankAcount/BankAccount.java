package com.bankAcount;

public class BankAccount {
  
  double balance;
  
  public BankAccount() {
    this.balance = 0.0;
  }
  public void deposite(double amount) {
    balance = balance+amount;
    System.out.println("Deposited amount is :" + amount);
  }
  public void withdraw(double amount) {
    if(balance >= amount) {
      balance = balance-amount;
    }else {
      System.out.println("Not enough money!");
    }
  }
  public double checkAccountBalance() {
    System.out.println("The balance is : " + balance);
    return balance;
  }

}
