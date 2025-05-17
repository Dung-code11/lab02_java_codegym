/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong4;

import java.util.Random;

/**
 *
 * @author DUNG LE
 */
public class bt2 {
    private long starttime;
    private long endtime;
    public bt2(){
        this.starttime = System.currentTimeMillis();
    }
    public long getstarttime(){
        return starttime;
    }
    public long getendtime(){
        return endtime;
    }
    public void start(){
        this.starttime = System.currentTimeMillis();
    }
    public void stop(){
        this.endtime = System.currentTimeMillis();
    }
    public long getElapsedtime(){
        return endtime - starttime;
    }
    
public class TestSelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random rand = new Random();

        // Tạo mảng với 100,000 số ngẫu nhiên
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        bt2 watch = new bt2();
        watch.start();

        selectionSort(numbers);

        watch.stop();
        System.out.println("Thời gian thực thi thuật toán selection sort với 100,000 phần tử là: " + watch.getElapsedtime()+ " milliseconds");
    }
}
}
