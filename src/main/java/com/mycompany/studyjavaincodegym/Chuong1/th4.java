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
public class th4 {
    public static void main(String[] args) {
        System.out.println("Giai Phuong Trinh bac nhat: a*x + b = c");
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap a: ");
        double a = nhap.nextDouble();
        System.out.println("nhap b: ");
        double b = nhap.nextDouble();
        System.out.println("nhap c : ");
        double c = nhap.nextDouble();
        if(a != 0 ){
            double kq = ( c - b) / a;
            System.out.printf("x = %f! \n", kq);
        }else{
            if(b == c){
                System.out.print("x vo so nghiem");
            }
            else{
                System.out.println("x vo nghiem");
            }
        }
    }
}
