/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong14;

/**
 *
 * @author DUNG LE
 */
public class th3 {

    public static void selectionSort(int[] list) {
        int n = list.length;

        // Duyệt qua từng vị trí trong mảng
        for (int i = 0; i < n - 1; i++) {
            // Giả sử vị trí i là vị trí của phần tử lớn nhất
            int maxIndex = i;

            // Tìm phần tử lớn nhất trong đoạn [i+1, n-1]
            for (int j = i + 1; j < n; j++) {
                if (list[j] > list[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Hoán đổi nếu cần
            if (maxIndex != i) {
                int temp = list[i];
                list[i] = list[maxIndex];
                list[maxIndex] = temp;
            }
        }
    }

    // Hàm main để kiểm thử
    public static void main(String[] args) {
        int[] list = {4, 7, 2, 9, 1, 5};
        selectionSort(list);

        // In mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
