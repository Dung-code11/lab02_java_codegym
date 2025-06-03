/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DUNG LE
 */
public class opbt2 {
    public static boolean Palindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Đưa từng ký tự vào stack và queue
        for (char ch : input.toCharArray()) {
            stack.push(ch);
            queue.offer(ch);
        }

        // So sánh từng phần tử
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;  // Nếu khác nhau => không phải palindrome
            }
        }
        return true;  // Nếu tất cả giống nhau => palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = sc.nextLine();

        // Loại bỏ dấu cách và chuyển về chữ thường để kiểm tra chính xác
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        if (Palindrome(processedInput)) {
            System.out.println("Chuỗi \"" + input + "\" là Palindrome.");
        } else {
            System.out.println("Chuỗi \"" + input + "\" không phải là Palindrome.");
        }
    }
}
