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
public class th1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap vao mot so" );
        int number = nhap.nextInt();
        if(number < 2){
            System.out.println(number + "khong phai la so nguyen to");
        }
        else{
            int i = 2;
            boolean check =true;
            while (i <= Math.sqrt(number)){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(number + "la so nguyen to");
            }
            else{
                System.out.println(number + "khong là so nguyen to");
            }
        }
    }
}
