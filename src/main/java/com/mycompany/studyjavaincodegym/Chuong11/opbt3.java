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
public class opbt3 {
    public static boolean MatchingPair(char left, char right) {
        return (left == '(' && right == ')') ||
               (left == '[' && right == ']') ||
               (left == '{' && right == '}');
    }

    
    public static boolean checkBrackets(String expression) {
        Stack<Character> bStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char sym = expression.charAt(i);

           
            if (sym == '(' || sym == '[' || sym == '{') {
                bStack.push(sym);
            }
            
            else if (sym == ')' || sym == ']' || sym == '}') {
              
                if (bStack.isEmpty()) {
                    return false;
                }

                char left = bStack.pop();

            
                if (!MatchingPair(left, sym)) {
                    return false;
                }
            }
            
        }

        
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập biểu thức cần kiểm tra dấu ngoặc:");
        String expression = sc.nextLine();

        if (checkBrackets(expression)) {
            System.out.println("Biểu thức sử dụng dấu ngoặc đúng.");
        } else {
            System.out.println("Biểu thức sử dụng dấu ngoặc sai.");
        }
    }
}
