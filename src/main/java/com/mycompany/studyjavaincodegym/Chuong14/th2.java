/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong14;

/**
 *
 * @author DUNG LE
 */
public class th2 {

    public static void bubbleSort(int[] list) {
        int n = list.length;
        boolean swapped;

        System.out.println("Mảng ban đầu:");
        printArray(list);

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    // Hoán đổi
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;

                    // Hiển thị trạng thái mảng sau mỗi lần hoán đổi
                    System.out.println("Hoán đổi phần tử tại vị trí " + j + " và " + (j + 1) + ":");
                    printArray(list);
                }
            }

            if (!swapped) {
                // Nếu không có hoán đổi nào trong vòng lặp, kết thúc
                System.out.println("Không còn hoán đổi. Mảng đã được sắp xếp.");
                break;
            }
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
        // Khai báo mảng
        int[] list = {6, 3, 8, 5, 2, 7};

        // Gọi phương thức sắp xếp và hiển thị quá trình
        bubbleSort(list);
    }
}
