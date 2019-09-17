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
public class TestsScores {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        char test1LetterGrade = 'x';
        char test2LetterGrade = 'x';
        char test3LetterGrade = 'x';

        System.out.println("Please enter the first test score:");
        double testScore1 = keyboard.nextDouble();
        if (testScore1 >= 90) {
            test1LetterGrade = 'A';
        }
        if (testScore1 >= 80 && testScore1 < 90) {
            test1LetterGrade = 'B';
        }
        if (testScore1 >= 70 && testScore1 < 80) {
            test1LetterGrade = 'C';
        }
        if (testScore1 >= 60 && testScore1 < 70) {
            test1LetterGrade = 'D';
        }
        if (testScore1 < 60) {
            test1LetterGrade = 'F';
        }
        System.out.println("Please enter the second test score:");
        double testScore2 = keyboard.nextDouble();
        if (testScore2 >= 90) {
            test2LetterGrade = 'A';
        }
        if (testScore2 >= 80 && testScore1 < 90) {
            test2LetterGrade = 'B';
        }
        if (testScore2 >= 70 && testScore2 < 80) {
            test2LetterGrade = 'C';
        }
        if (testScore2 >= 60 && testScore2 < 70) {
            test2LetterGrade = 'D';
        }
        if (testScore2 < 60) {
            test2LetterGrade = 'F';
        }
        System.out.println("Please enter the third test score:");
        double testScore3 = keyboard.nextDouble();
        if (testScore3 >= 90) {
            test3LetterGrade = 'A';
        }
        if (testScore3 >= 80 && testScore3 < 90) {
            test3LetterGrade = 'B';
        }
        if (testScore3 >= 70 && testScore3 < 80) {
            test3LetterGrade = 'C';
        }
        if (testScore3 >= 60 && testScore3 < 70) {
            test3LetterGrade = 'D';
        }
        if (testScore3 < 60) {
            test3LetterGrade = 'F';
        }

        double testScoreAvg = (testScore1 + testScore2 + testScore3) / 3;

        NumberFormat nf = NumberFormat.getInstance();
        {
            nf.setMaximumFractionDigits(2);
            nf.setMinimumFractionDigits(2);
        }

        System.out.println("Test 1 Grade: " + test1LetterGrade + " " + testScore1);
        System.out.println("Test 2 Grade: " + test2LetterGrade + " " + testScore2);
        System.out.println("Test 3 Grade: " + test3LetterGrade + " " + testScore3);
        System.out.println("The average grade of all tests was: " + nf.format(testScoreAvg));

    }
}
