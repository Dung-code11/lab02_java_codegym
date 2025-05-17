/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong4;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class bt1 {
    int a,b,c;
    public bt1(){
    }
    public bt1(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getketqua(){
        double delta = b * b - 4 * a * c;
if (delta > 0) {
    double sqrtDelta = Math.sqrt(delta);
    double x1 = (-b + sqrtDelta) / (2 * a);
    double x2 = (-b - sqrtDelta) / (2 * a);
    System.out.println("Phương trình có hai nghiệm là: x1 = " + x1 + ", x2 = " + x2);
} else if (delta == 0) {
    double x = -b / (2.0 * a);
    System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x);
} else {
    System.out.println("Phương trình vô nghiệm.");
}

    }
    public class main{
        public static void main(String[] args) {
            Scanner nhap = new Scanner(System.in);
            System.out.println("Nhập a; ");
            int a = nhap.nextInt();
            System.out.println("Nhập b: ");
            int b = nhap.nextInt();
            System.out.println("Nhập c: ");
            int c = nhap.nextInt();
            bt1 pt2 = new bt1(a, b, c);
            pt2.getketqua();
        }
    }
}
