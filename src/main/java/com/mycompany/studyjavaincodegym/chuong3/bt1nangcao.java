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
public class bt1nangcao {
    public static void main(String[] args) {
        Scanner nhap =new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = nhap.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        int cols = nhap.nextInt();
        
        double [][] matran = new double[rows][cols];
        System.out.println("Các Phần Tử Của Ma Trận: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Ma Trận["+i+"]["+j+"]=");
                matran[i][j] =nhap.nextDouble();
            }
        }
        System.out.println("Nhập số thứ tự của cột cần tính tổng: ");
        int col =nhap.nextInt();
        if(col < 0|| col >= cols){
            System.out.println("Cột không hợp lệ !");
        }else{
            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matran[i][col];
                
            }
            System.out.println("Tổng các phần tử ở cột "+col+" là: " +sum);
        }
        nhap.close();
    }
}
