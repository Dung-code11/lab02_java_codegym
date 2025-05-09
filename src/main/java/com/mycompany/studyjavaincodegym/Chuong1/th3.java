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
public class th3 {
    public static void main(String[] args) {
        float cd;
        float cr;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhập chiều dài: ");
        cd = nhap.nextFloat();
        System.out.println("nhập chiều rộng: ");
        cr = nhap.nextFloat();
        float area = cd * cr;
        System.out.println("Ara is: " +area);
    }
}
