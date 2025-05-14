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
public class bt2nangcao {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập ma trận vuông: ");
        int n = nhap.nextInt();
        double[][] matran = new double[n][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ma Trận ["+i+"]["+j+"] = ");
                matran[i][j] = nhap.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matran[i][i];
        }
        System.out.println("Tổng các phần tử đường chéo chính : " +sum );
        nhap.close();
    }
}
