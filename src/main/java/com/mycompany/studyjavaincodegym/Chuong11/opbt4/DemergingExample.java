/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong11.opbt4;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author DUNG LE
 */
public class DemergingExample {
    public static void demerging(Queue<NhanSu> inputQueue, Queue<NhanSu> nuQueue, Queue<NhanSu> namQueue) {
        while (!inputQueue.isEmpty()) {
            NhanSu p = inputQueue.poll();
            if (p.gioiTinh.equalsIgnoreCase("Nu")) {
                nuQueue.offer(p);
            } else if (p.gioiTinh.equalsIgnoreCase("Nam")) {
                namQueue.offer(p);
            }
        }
    }
    public static void main(String[] args) {
        Queue<NhanSu> inputQueue = new LinkedList<>();

        inputQueue.offer(new NhanSu("Nguyen Thi A", "Nu", "1980-05-20"));
        inputQueue.offer(new NhanSu("Tran Van B", "Nam", "1982-03-15"));
        inputQueue.offer(new NhanSu("Le Thi C", "Nu", "1985-12-30"));
        inputQueue.offer(new NhanSu("Pham Van D", "Nam", "1987-11-11"));
        inputQueue.offer(new NhanSu("Hoang Thi E", "Nu", "1990-06-05"));

        Queue<NhanSu> nuQueue = new LinkedList<>();
        Queue<NhanSu> namQueue = new LinkedList<>();

        demerging(inputQueue, nuQueue, namQueue);

        System.out.println("Danh sách Nữ (giữ thứ tự ngày sinh):");
        while (!nuQueue.isEmpty()) {
            System.out.println(nuQueue.poll());
        }

        System.out.println("\nDanh sách Nam (giữ thứ tự ngày sinh):");
        while (!namQueue.isEmpty()) {
            System.out.println(namQueue.poll());
        }
    }
}
