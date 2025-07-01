/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong16;

/**
 *
 * @author DUNG LE
 */
import java.io.*;
import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập đường dẫn file nguồn:");
        String sourcePath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println(" File nguồn không tồn tại.");
            return;
        }

        System.out.println("Nhập đường dẫn file đích:");
        String targetPath = scanner.nextLine();

        File targetFile = new File(targetPath);
        if (targetFile.exists()) {
            System.out.println(" File đích đã tồn tại. Ghi đè? (y/n)");
            String overwrite = scanner.nextLine();
            if (!overwrite.equalsIgnoreCase("y")) {
                System.out.println(" Thao tác bị hủy.");
                return;
            }
        }

        int charCount = 0;

        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))
        ) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
                charCount++;
            }
            System.out.println(" Sao chép hoàn tất. Số ký tự đã sao chép: " + charCount);
        } catch (IOException e) {
            System.out.println(" Đã xảy ra lỗi khi xử lý file: " + e.getMessage());
        }
    }
}

