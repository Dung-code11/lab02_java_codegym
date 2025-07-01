/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong17.bt1;

/**
 *
 * @author DUNG LE
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn tệp đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra tồn tại tệp nguồn
        if (!sourceFile.exists()) {
            System.out.println("❌ Tệp nguồn không tồn tại.");
            return;
        }

        // Kiểm tra nếu tệp đích đã tồn tại
        if (targetFile.exists()) {
            System.out.println("⚠️ Tệp đích đã tồn tại. Bạn có muốn ghi đè không? (y/n): ");
            String confirm = scanner.nextLine();
            if (!confirm.equalsIgnoreCase("y")) {
                System.out.println("❌ Sao chép bị hủy.");
                return;
            }
        }

        // Bắt đầu sao chép
        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(targetFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            long totalBytes = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("✅ Sao chép hoàn tất. Tổng số byte: " + totalBytes);

        } catch (IOException e) {
            System.out.println("❌ Lỗi trong quá trình sao chép: " + e.getMessage());
        }
    }
}

