/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong19;

/**
 *
 * @author DUNG LE
 */
public class bt1 {
    public static boolean kiemTraTenLop(String tenLop) {
        return tenLop.matches("^[CAP]\\d{4}[GHIK]$");
    }

    public static void main(String[] args) {
        System.out.println(kiemTraTenLop("C0223G")); // true
        System.out.println(kiemTraTenLop("A0323K")); // true
        System.out.println(kiemTraTenLop("M0318G")); // false
        System.out.println(kiemTraTenLop("P0323A")); // false
    }
}
