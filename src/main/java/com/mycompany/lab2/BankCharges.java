/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Deric
 */
public class BankCharges {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance();
        {
            nf.setMaximumFractionDigits(2);
            nf.setMinimumFractionDigits(2);
        }
        
        double baseFee = 10;
        double checkFee=0;
        System.out.println("Please enter the number of checks you wrote this month.");
        int numberOfChecks = keyboard.nextInt();
        if (numberOfChecks<20)
        {
            checkFee = numberOfChecks *.10;
        }
        if (numberOfChecks>=20 && numberOfChecks<=39)
        {
        checkFee = numberOfChecks * .08;
        }
        if (numberOfChecks>=40 && numberOfChecks<=59)
        {
        checkFee = numberOfChecks*.06;
        }
        if (numberOfChecks>=60)
        {
        checkFee = numberOfChecks*.04; 
        }
        double totalServiceFees = checkFee+baseFee;
        System.out.println("The number of checks written this month is: " + numberOfChecks);
        System.out.println("Monthly Base Fee: " + nf.format(baseFee));
        System.out.println("Total Checking Fees: " + nf.format(checkFee));
        System.out.println("Total Monthly Service Charges: " + nf.format(totalServiceFees));
        
    }
}
