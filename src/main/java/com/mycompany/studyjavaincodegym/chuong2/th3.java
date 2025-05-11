/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong2;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class th3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = nhap.nextInt();
        System.out.println("Nhap b: ");
        b = nhap.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0){
            System.out.println("Khong co ươc chung");
        }
        while(a!=b){
            if (a > b){
                a = a-b;
            }
            else{
                b= b - a;
            }
        }
        System.out.println("ươc chung lon nhat là: "+a);
    }
}
