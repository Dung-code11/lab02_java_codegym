/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong3;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class th2 {
    public static void main(String[] args) {
        String[] students = {"Christian","Michael","Camila","Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner nhap = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = nhap.nextLine();
        boolean isExist = false;
for (int i = 0; i < students.length; i++) {
    if (students[i].equals(input_name)) {
        System.out.println("Position of the students in the list " + input_name + " is: " + i);
        isExist = true;
        break;
    }
}
if (!isExist) {
    System.out.println("Not found" + input_name + " in the list.");
}
    }
}
