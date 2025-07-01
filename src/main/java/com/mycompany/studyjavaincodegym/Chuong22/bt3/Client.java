/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong22.bt3;

/**
 *
 * @author DUNG LE
 */
import java.util.*;

public class Client {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 12, 3, 9, 30, 7));

        SetProcessor processor = new CollectionUtilsAdapter();
        int max = processor.findMax(numbers);

        System.out.println("Giá trị lớn nhất là: " + max);
    }
}

