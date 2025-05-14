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
public class bt2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int array[] = {1,3,5,7,9,8,10,12};
        int n = array.length;
        System.out.println("Hiện Thị Mảng Ban Đầu: ");
        for(int i = 0 ; i<n;i++){
            System.out.println(array[i] + "");
        }
        System.out.println("");
        System.out.println("Nhập Phần Tử Cần Thêm: ");
        int pt = nhap.nextInt();
        int[] newarray = new int[n+1];
        for (int i = 0; i < n; i++) {
            newarray[i] = array[i];
            
        }
        newarray[n]=pt;
        System.out.println("Mảng mới sau khi thêm: ");
        for (int i = 0; i < newarray.length; i++) {
            System.out.println(newarray[i] + "");
        }
        nhap.close();
    }
}
