/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong11;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author DUNG LE
 */
public class bt2 {
      public static void main(String[] args) {
        String input = "Xin chào các bạn, chào mừng các bạn đến với Java. Java rất thú vị!";
        
        
        input = input.replaceAll("[^a-zA-Zà-ỹÀ-Ỹ0-9\\s]", "").toLowerCase();

       
        String[] words = input.split("\\s+");

       
          TreeMap<String, Integer> wordMap = new TreeMap<>();

        
        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1); // Tăng số lượng
            } else {
                wordMap.put(word, 1); // Thêm từ mới
            }
        }

        
        System.out.println("Tần suất xuất hiện của mỗi từ:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
