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
public class th5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Thang ban muon nhap: ");
        int thang = nhap.nextInt();
        switch (thang){
            case 2:
                System.out.println("Thang 2 cos 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang" + thang + "co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + thang + "' has 30 days!");
                break;
             default:
                System.out.print("Invalid input!");
                break;
        }
    }
}
