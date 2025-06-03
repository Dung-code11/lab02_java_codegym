/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong11;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DUNG LE
 */
public class opbt1 {
    public static String nhisangthap(int decimalNumber) {
        if (decimalNumber == 0) return "0";

        Stack<Integer> stack = new Stack<>();

      
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }

      
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int decimalNumber = sc.nextInt();

        String binaryNumber = nhisangthap(decimalNumber);
        System.out.println("Số nhị phân tương ứng: " + binaryNumber);
    }
}
