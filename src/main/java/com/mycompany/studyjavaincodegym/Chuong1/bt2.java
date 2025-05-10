/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong1;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class bt2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so tien USD: ");
        int usd = nhap.nextInt();
        int vnd = usd * 23000;
        System.out.printf("So tien VND: " , vnd);
    }
}
