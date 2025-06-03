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
public class mangchuoi {
    public static void main(String[] args) {
        String input = "Xin chào các bạn";
        String[] words = input.split(" ");
        Stack<String> wordStack = new Stack<>();

        // Bước 1: Push từng từ vào Stack
        for (String word : words) {
            wordStack.push(word);
        }

        // Bước 2: Pop từng từ và nối lại thành chuỗi
        StringBuilder output = new StringBuilder();
        while (!wordStack.isEmpty()) {
            output.append(wordStack.pop());
            if (!wordStack.isEmpty()) {
                output.append(" ");
            }
        }

        System.out.println("Chuỗi sau khi đảo từ: " + output.toString());
    }
}
