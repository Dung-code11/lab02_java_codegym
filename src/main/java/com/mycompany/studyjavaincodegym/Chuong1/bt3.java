/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong1;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class bt3 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên không âm (tối đa 3 chữ số): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            System.out.println(convertToWords(number));
        }

        scanner.close();
    }

    public static String convertToWords(int number) {
        if (number < 10) {
            return oneDigit(number);
        } else if (number < 20) {
            return teens(number);
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            if (ones == 0)
                return tens(tens);
            else
                return tens(tens) + " " + oneDigit(ones);
        } else {
            int hundreds = number / 100;
            int remainder = number % 100;
            String result = oneDigit(hundreds) + " hundred";
            if (remainder != 0) {
                result += " and " + convertToWords(remainder);
            }
            return result;
        }
    }

    public static String oneDigit(int number) {
        switch (number) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    public static String teens(int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    public static String tens(int number) {
        switch (number) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
