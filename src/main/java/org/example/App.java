/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;
import java.text.NumberFormat;
import java.math.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("Please enter the number of the month: ");
        String strMonth = scan.nextLine();

        //processing
        int month = Integer.parseInt(strMonth);
        String monthStr;

        switch (month)
        {
            case 1: monthStr = "January";
                break;
            case 2: monthStr = "February";
                break;
            case 3: monthStr = "March";
                break;
            case 4: monthStr = "April";
                break;
            case 5: monthStr = "May";
                break;
            case 6: monthStr = "June";
                break;
            case 7: monthStr = "July";
                break;
            case 8: monthStr = "August";
                break;
            case 9: monthStr = "September";
                break;
            case 10: monthStr = "October";
                break;
            case 11: monthStr = "November";
                break;
            case 12: monthStr = "December";
                break;
            default: monthStr = "Error: value of of range";
                break;
        }
        System.out.println("The name of the month is " +monthStr);
    }
}
