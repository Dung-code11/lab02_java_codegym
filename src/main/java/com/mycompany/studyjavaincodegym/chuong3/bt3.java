/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong3;

/**
 *
 * @author DUNG LE
 */
import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập kích thước cho 2 mảng
        System.out.print("Nhập số phần tử của mảng 1: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        System.out.print("Nhập số phần tử của mảng 2: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        // Bước 2: Nhập giá trị cho mảng 1
        System.out.println("Nhập giá trị cho mảng 1:");
        for (int i = 0; i < n1; i++) {
            System.out.print("array1[" + i + "] = ");
            array1[i] = scanner.nextInt();
        }

        // Nhập giá trị cho mảng 2
        System.out.println("Nhập giá trị cho mảng 2:");
        for (int i = 0; i < n2; i++) {
            System.out.print("array2[" + i + "] = ");
            array2[i] = scanner.nextInt();
        }

        // Bước 3: Tạo mảng thứ 3 có kích thước n1 + n2
        int[] array3 = new int[n1 + n2];

        // Bước 4: Gán các phần tử mảng 1 vào mảng 3
        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i];
        }

        // Bước 5: Gán các phần tử mảng 2 vào mảng 3, tiếp theo sau mảng 1
        for (int i = 0; i < n2; i++) {
            array3[n1 + i] = array2[i];
        }

        // In ra mảng sau khi gộp
        System.out.print("Mảng sau khi gộp (array3): ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

        scanner.close();
    }
}

