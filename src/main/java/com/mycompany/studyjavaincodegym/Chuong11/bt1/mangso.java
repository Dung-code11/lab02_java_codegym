/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong11.bt1;

import java.util.Stack;

/**
 *
 * @author DUNG LE
 */
public class mangso {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();

        // Bước 1: Push các phần tử vào Stack
        for (int num : array) {
            stack.push(num);
        }

        // Bước 2: Pop ngược lại vào mảng
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        // In mảng sau khi đảo
        System.out.print("Mảng sau khi đảo ngược: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
