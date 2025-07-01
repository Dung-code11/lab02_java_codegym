/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong16.th1;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class main {
    public static void main(String[] args) {
	System.out.println("Nhập đường dẫn file: ");
	Scanner scanner = new Scanner(System.in);
	String path = scanner.nextLine();

	ReadFileExample readfileEx = new ReadFileExample();
	readfileEx.readFileText(path);
}
}
