/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong19;

/**
 *
 * @author DUNG LE
 */
public class bt2 {
     public static boolean kiemTraSoDienThoai(String soDT) {
        return soDT.matches("^\\(\\d{2}\\)-\\(0\\d{9}\\)$");
    }

    public static void main(String[] args) {
        System.out.println(kiemTraSoDienThoai("(84)-(0978489648)")); // true
        System.out.println(kiemTraSoDienThoai("(a8)-(22222222)"));   // false
        System.out.println(kiemTraSoDienThoai("(84)-(22b22222)"));   // false
        System.out.println(kiemTraSoDienThoai("(84)-(9978489648)")); // false
    }
}
