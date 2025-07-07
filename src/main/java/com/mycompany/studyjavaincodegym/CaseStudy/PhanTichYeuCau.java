/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.CaseStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class PhanTichYeuCau {
    public static YeuCau phanTich(String dauVao,Scanner nhap){
        String[] tokens = dauVao.trim().split("\\s+");
        String hanhDong = tokens[0];
        String tuKhoa = tokens.length > 1 ? tokens[tokens.length - 1] : "";
        List<String> tuVung = new ArrayList<>();
        for (int i = 1; i < tokens.length - 1; i++) {
            tuVung.add(tokens[i]);
        }
        if(hanhDong.equals("Nghĩa") && !tuVung.isEmpty()){
            String loaiTu = tuVung.get(0);
            System.out.println(loaiTu+ "Có Nghĩa: ");
            String dinhNghia = nhap.nextLine();
            String cau = "" ;
            String nghiaTu = "";
            if(loaiTu.equals("--Danh từ")|| loaiTu.equals("--Tính từ")||loaiTu.equals("--Động từ")||loaiTu.equals("--n")||loaiTu.equals("--a")||loaiTu.equals("--v")){
                System.out.println("Câu: ");
                cau = nhap.nextLine();
                if(!cau.isEmpty()){
                    System.out.println("Câu này có nghĩa là: ");
                    nghiaTu = nhap.nextLine();
                }
            }
            tuVung.add(dinhNghia);
            tuVung.add(cau);
            tuVung.add(nghiaTu);
        }
        return new YeuCau(hanhDong, tuVung, tuKhoa);
    }
}
