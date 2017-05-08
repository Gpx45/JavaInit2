package com.company.dialog;

import javax.swing.JOptionPane;     //Is a package with classes for creating GUI components
import java.util.*;
public class Main {

    public static void main(String[] args) {

        regularDialog();


}


    public static void regularDialog(){

        //showMessageDialog outputs a dialog box in the center of the screen due to null(location parameter)
        JOptionPane.showMessageDialog(null,"Welcome to main Lobby");
        //showInputDialog asks for input from user then its stored into the variable type "String" name.
        String name = JOptionPane.showInputDialog("Enter your user name:");
        String message = String.format("You are in the Queue: %s", name);       //Uses String method format to format the string and set it to variable message
        //%s is a format specifier that replaces a "string" variable.
        JOptionPane.showMessageDialog(null, message);
        getMath();
    }

    public static void getMath() {
        JOptionPane.showMessageDialog(null,"Calculator App");

        String num1 = JOptionPane.showInputDialog("Enter your 1st number:");
        Integer.parseInt(num1);
        int answer = 0;
        String num2 = JOptionPane.showInputDialog("Enter your 2nd number:");
        Integer.parseInt(num2);
        answer = Integer.parseInt(num1) + Integer.parseInt(num2);
        JOptionPane.showMessageDialog(null,answer);
    }

}