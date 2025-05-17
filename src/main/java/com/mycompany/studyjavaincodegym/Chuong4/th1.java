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
public class th1 {
        double cd,cr;
        public th1(){
        }
        public th1(double cd,double cr){
            this.cd = cd;
            this.cr = cr;
        }
        public double getarea(){
            return this.cd * this.cr;
        }
        public  double getperimeter(){
            return (this.cd + this.cr) *2;
        }
        public String display(){
            return "Rectangle{" + "width" + cd + ", height" + cr +"}";
        }
        public class main{
            public static void main(String[] args) {
                Scanner nhap = new Scanner(System.in);
                System.out.println("Nhập chiều dài: ");
                double width = nhap.nextDouble();
                System.out.println("Nhập chiều rộng: ");
                double height = nhap.nextDouble();
                th1 chunhat = new th1(width, height);
                System.out.println("Hình chữ Nhật \n " +chunhat.display());
                System.out.println("Chu vi \n " +chunhat.getperimeter());
                System.out.println("Diện tích \n " +chunhat.getarea());
            }
        }
}
