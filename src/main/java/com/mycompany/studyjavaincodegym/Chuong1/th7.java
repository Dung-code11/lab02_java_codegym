/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong1;

/**
 *
 * @author DUNG LE
 */
import java.util.Scanner;

public class th7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều cao và cân nặng
        System.out.print("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();

        // Tính BMI
        double bmi = weight / (height * height);

        // Hiển thị kết quả
        System.out.printf("Chỉ số BMI của bạn là: %.2f\n", bmi);
        System.out.print("Phân loại: ");

        // Đánh giá theo bảng
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        scanner.close();
    }
}

