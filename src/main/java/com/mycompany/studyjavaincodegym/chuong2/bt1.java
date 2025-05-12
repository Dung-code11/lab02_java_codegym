/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong2;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class bt1 {
     public static void printRectangle(Scanner scanner) {
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangle(Scanner scanner) {
        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        System.out.println("Choose corner:");
        System.out.println("1. Top-left");
        System.out.println("2. Top-right");
        System.out.println("3. Bottom-left");
        System.out.println("4. Bottom-right");
        System.out.print("Your choice: ");
        int corner = scanner.nextInt();

        switch (corner) {
            case 1:
                for (int i = size; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = size; i > 0; i--) {
                    for (int j = 0; j < size - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= size; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <= size; i++) {
                    for (int j = 0; j < size - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid corner choice.");
        }
    }

    public static void printIsoscelesTriangle(Scanner scanner) {
        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (4 corners)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle(scanner);
                    break;
                case 2:
                    printSquareTriangle(scanner);
                    break;
                case 3:
                    printIsoscelesTriangle(scanner);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        }
    }
}
