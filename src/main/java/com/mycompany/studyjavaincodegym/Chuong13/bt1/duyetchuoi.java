/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong13.bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class duyetchuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        // Mảng để lưu dãy LIS cuối
        ArrayList<Character> lis = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Nếu lis trống hoặc c > kí tự cuối lis thì thêm c vào
            if (lis.isEmpty() || c > lis.get(lis.size() - 1)) {
                lis.add(c);
            } else {
                // Tìm vị trí để thay thế kí tự >= c (binary search)
                int pos = Collections.binarySearch(lis, c);
                if (pos < 0) {
                    pos = -pos - 1;
                }
                lis.set(pos, c);
            }
        }

        // Chuyển ArrayList thành chuỗi kết quả
        StringBuilder result = new StringBuilder();
        for (char ch : lis) {
            result.append(ch);
        }

        System.out.println("Chuỗi con tăng dần dài nhất: " + result.toString());
    } 
}
