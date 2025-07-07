/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.CaseStudy;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        tuDien service = tuDien.getVidu();
        QuanLyYeuCau controller = new QuanLyYeuCau(service);
        service.loadFromDisk();

        System.out.print("Action: ");
        String input = scanner.nextLine();
        YeuCau request = PhanTichYeuCau.phanTich(input, scanner);
        controller.xuLy(request);

        service.saveToDisk();
    }
}
