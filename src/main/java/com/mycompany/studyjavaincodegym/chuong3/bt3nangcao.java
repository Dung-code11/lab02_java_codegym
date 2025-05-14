/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong3;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class bt3nangcao {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String str = "Lap trinh java rat thu vi hahaha ";
        System.out.println("Nhập một ký tự cần đếm : ");
        char kytu = nhap.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == kytu){
                count ++;
                        }
        }
        System.out.println("Ký tự " + kytu + "xuất hiện "+count+" lần");
        nhap.close();
    }
}
