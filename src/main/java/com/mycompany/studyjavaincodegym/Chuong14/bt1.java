/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong14;

/**
 *
 * @author DUNG LE
 */
public class bt1 {

    public static void insertionSort(int[] list) {
        int n = list.length;

        System.out.println("Mảng ban đầu:");
        printArray(list);

        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key về sau
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            // Chèn key vào vị trí đúng
            list[j + 1] = key;

            // Hiển thị mảng sau mỗi bước chèn
            System.out.println("Bước " + i + ": Chèn " + key + " vào vị trí " + (j + 1));
            printArray(list);
        }

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(list);
    }

    // Hàm in mảng
    public static void printArray(int[] list) {
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Hàm main
    public static void main(String[] args) {
        int[] list = {7, 3, 5, 2, 9, 1};
        insertionSort(list);
    }
}

