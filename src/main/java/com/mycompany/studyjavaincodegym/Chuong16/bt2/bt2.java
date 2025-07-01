/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong16.bt2;

/**
 *
 * @author DUNG LE
 */
import java.io.*;
import java.util.*;

class QuocGia {
    private int id;
    private String code;
    private String name;

    public QuocGia(int id, String code, String name) {
        this.id = id;
        this.code = code.replace("\"", "");  // Bỏ dấu " nếu có
        this.name = name.replace("\"", "");
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Code: %s | Name: %s", id, code, name);
    }
}

public class bt2 {
    public static void main(String[] args) {
        String filePath = "quocgia.txt";  // Đường dẫn file CSV

        List<QuocGia> danhSach = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Tách dòng theo dấu phẩy
                String[] parts = line.split(",");

                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String code = parts[1].trim();
                    String name = parts[2].trim();

                    QuocGia qg = new QuocGia(id, code, name);
                    danhSach.add(qg);
                }
            }

            System.out.println(" Danh sách các quốc gia:");
            for (QuocGia qg : danhSach) {
                System.out.println(qg);
            }

        } catch (IOException e) {
            System.out.println(" Lỗi đọc file: " + e.getMessage());
        }
    }
}

