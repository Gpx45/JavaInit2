package com.blank.account;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        double beginAmount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Input an Amount: ");
        beginAmount = input.nextDouble();
        accountTest user = new accountTest(beginAmount);
        user.credit(beginAmount);
        System.out.println(user.returnBalance());




    }


}
