/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong3;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] array = {1, 3, 5, 7, 9, 11};
        int n = array.length;

        System.out.print("Mảng ban đầu (value): ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        
        System.out.print("Nhập phần tử cần xoá: ");
        int x = scanner.nextInt();

        
        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }

        
        if (index_del != -1) {
            System.out.println("Phần tử " + x + " được tìm thấy tại vị trí " + index_del);

            for (int i = index_del; i < n - 1; i++) {
                array[i] = array[i + 1];  
            }
            n--; 

            
            System.out.print("Mảng sau khi xoá (new value): ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Phần tử " + x + " không tồn tại trong mảng.");
        }

        scanner.close();
    }
}
