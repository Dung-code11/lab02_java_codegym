/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong22.th3;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Enter file or folder path: ");
    String path = scanner.nextLine();
    FileCalculator fileCalculator = new FileCalculatorAdapter();
    Client client = new Client(fileCalculator);
    client.printFileSize(path);
}
}
