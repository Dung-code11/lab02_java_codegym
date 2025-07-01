/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong14;

/**
 *
 * @author DUNG LE
 */
public class bt2 {

    public static void insertionSort(int[] list) {
        int n = list.length;

        // Duyệt từ phần tử thứ hai đến hết mảng
        for (int i = 1; i < n; i++) {
            int key = list[i]; // Phần tử cần chèn
            int j = i - 1;

            // Dời các phần tử lớn hơn key về phía sau
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            // Chèn key vào vị trí đúng
            list[j + 1] = key;
        }
    }

    // Hàm main để kiểm thử
    public static void main(String[] args) {
        int[] list = {9, 5, 1, 4, 3};

        insertionSort(list);

        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

