/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong6.btnangcao;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh 3: ");
        double side3 = sc.nextDouble();
        sc.nextLine(); // clear buffer

        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.print("Nhập màu sắc của tam giác: ");
        String color = sc.nextLine();
        triangle.setColor(color);

        System.out.print("Tam giác có được tô màu không? (true/false): ");
        boolean filled = sc.nextBoolean();
        triangle.setFilled(filled);

        System.out.println("\n--- THÔNG TIN TAM GIÁC ---");
        System.out.println(triangle.toString());
        System.out.println("Màu sắc: " + triangle.getColor());
        System.out.println("Đã tô màu: " + triangle.isFilled());
        System.out.printf("Chu vi: %.2f\n", triangle.getPerimeter());
        System.out.printf("Diện tích: %.2f\n", triangle.getArea());

        sc.close();
    }
}
