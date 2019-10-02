/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankentities;

/**
 *
 * @author wmasters
 */
public class BankAccount {
    private double balance;
    private double overdraft;
    private String holder;
    
    public BankAccount(String holder) {
        this.holder = holder;
        this.overdraft = 500;
        this.balance = 100;
    }
    
    public void depositMoney(double amount) {
        balance += amount;
    }
    
    public boolean withdrawMoney(double amount) {
        if((balance + overdraft) < amount) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public String getHolder() {
        return holder;
    }
    
    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }
    
}
