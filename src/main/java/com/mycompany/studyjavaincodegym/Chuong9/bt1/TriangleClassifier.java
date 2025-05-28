/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong9.bt1;

/**
 *
 * @author DUNG LE
 */
public class TriangleClassifier {
     public static String classify(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return "không phải là tam giác";
        if (a + b <= c || a + c <= b || b + c <= a) return "không phải là tam giác";
        if (a == b && b == c) return "tam giác đều";
        if (a == b || a == c || b == c) return "tam giác cân";
        return "tam giác thường";
    }
}
