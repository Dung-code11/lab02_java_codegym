/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong2;

/**
 *
 * @author DUNG LE
 */
public class bt3 {
    public static boolean isPrime(int number) {
        if (number < 2) return false;  // Loại bỏ các số nhỏ hơn 2
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // Nếu chia hết thì không phải nguyên tố
        }
        return true; // Nếu không chia hết cho số nào, đó là số nguyên tố
    }

    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
