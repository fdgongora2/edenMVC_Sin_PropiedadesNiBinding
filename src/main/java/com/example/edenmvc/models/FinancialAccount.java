package com.example.edenmvc.models;

import javafx.beans.property.*;

public class FinancialAccount {


    private String accountHolder;
    private Integer accountNumber;
    private Double accountBalance;

    public FinancialAccount(String accountHolder, Integer accountNumber, Double accountBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }


    public int getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }


    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public void withdraw(double amount) {
        this.accountBalance -= amount;
    }
}