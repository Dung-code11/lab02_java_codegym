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
public class th2 {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("so tien muon gui: ");
        money = input.nextDouble();
        System.out.println("so tháng gưi: ");
        month = input.nextInt();
        System.out.println("so lai suat: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month ; i++){
            totalInterest += money * (interestRate/100)/12 * month;
            System.out.println("so tien lai suat: " +totalInterest);
        }
    }
}
