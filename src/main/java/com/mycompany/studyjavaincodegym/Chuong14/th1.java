/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong14;

/**
 *
 * @author DUNG LE
 */
public class th1 {

    public static void bubbleSort(int[] list) {
        int n = list.length;
        boolean swapped;

        // Lặp qua từng phần tử trong mảng
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // So sánh các cặp phần tử liền kề
            for (int j = 0; j < n - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    // Hoán đổi nếu sai thứ tự
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }

            // Nếu không có hoán đổi nào, mảng đã được sắp xếp
            if (!swapped) {
                break;
            }
        }
    }

    // Hàm main để kiểm thử
    public static void main(String[] args) {
        int[] list = {5, 3, 8, 4, 2};
        bubbleSort(list);

        // In mảng sau khi sắp xếp
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
