
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author Deric
 */
public class SumOfNumbers {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please enter a positive non-zero integer");
       int maximumCounter = keyboard.nextInt();
       int counter=0;
       int sumOfNumbers = 0;
       while (counter<= maximumCounter)
       {
       sumOfNumbers = counter + sumOfNumbers;
       counter++;
       }
       System.out.println("The sum of all numbers from zero to "  + maximumCounter + " equals: " + sumOfNumbers);
    }
}