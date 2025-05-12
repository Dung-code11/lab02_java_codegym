/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong2;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class bt2 {
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many prime numbers to display: ");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        System.out.println("The first " + numbers + " prime numbers are:");
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
}
