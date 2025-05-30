/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong9.bt3;

/**
 *
 * @author DUNG LE
 */
public class FizzBuzz {

    public static String convert(int number) {
        boolean isFizz = number % 3 == 0 || String.valueOf(number).contains("3");
        boolean isBuzz = number % 5 == 0 || String.valueOf(number).contains("5");

        if (isFizz && isBuzz) return "FizzBuzz";
        if (isFizz) return "Fizz";
        if (isBuzz) return "Buzz";

        return readNumberInVietnamese(number);
    }

    private static String readNumberInVietnamese(int number) {
        String[] digits = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

        if (number < 10)
            return digits[number];

        int tens = number / 10;
        int ones = number % 10;

        return digits[tens] + " " + digits[ones];
    }

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(i + ": " + convert(i));
        }
    }
}

