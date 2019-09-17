/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author Deric
 */
public class BarChart {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the sales for the first store");
        int store1Sales = keyboard.nextInt();
        System.out.println("Please enter the sales for the second store");
        int store2Sales = keyboard.nextInt();
        System.out.println("Please enter the sales for the third store");
        int store3Sales = keyboard.nextInt();
        System.out.println("Please enter the sales for the fourth store");
        int store4Sales = keyboard.nextInt();
        System.out.println("Please enter the sales for the fifth store");
        int store5Sales = keyboard.nextInt();
        int loopCounter=0;
        String store1Bars = "";
        String store2Bars = "";
        String store3Bars = "";
        String store4Bars = "";
        String store5Bars = "";
        String asterik = "*";

        int store1Counter = store1Sales / 100;
        while (loopCounter < store1Counter) 
        {
            store1Bars = store1Bars + asterik;

            loopCounter++;
        }
loopCounter= 0;
        int store2Counter = store2Sales / 100;
        while (loopCounter < store2Counter) 
        {
            store2Bars = store2Bars + asterik;
            loopCounter++;
        }
        loopCounter = 0;
        int store3Counter = store3Sales / 100;
        while (loopCounter < store3Counter)
        {
            store3Bars = store3Bars + asterik;
            loopCounter++;
        }
        loopCounter = 0;
        int store4Counter = store4Sales / 100;
        while (loopCounter < store4Counter) {
            store4Bars = store4Bars + asterik;
            loopCounter++;
        }
        loopCounter = 0;
        int store5Counter = store5Sales / 100;
        while (loopCounter < store5Counter) 
        {
            store5Bars = store5Bars + asterik;
            loopCounter++;
        }

        System.out.println("SALES BAR CHART");
        System.out.println("Store 1: " + store1Bars);
        System.out.println("Store 2: " + store2Bars);
        System.out.println("Store 3: " + store3Bars);
        System.out.println("Store 4: " + store4Bars);
        System.out.println("Store 5: " + store5Bars);

    }

}
