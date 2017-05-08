package com.blank.account;
import java.util.*;

public class accountTest {

    private double balance;

    public accountTest(double initialBalance) {

    }

    public void credit(double amount){

        balance += amount;
        return;
    }

    public void getBalance() {
        System.out.print("\n\tPlace Initial Balance Amount: ");
        Scanner input = new Scanner(System.in);
        balance = input.nextDouble();

        return;
    }

    public double returnBalance() {

        return balance;
    }
}


