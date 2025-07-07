/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.CaseStudy;

/**
 *
 * @author DUNG LE
 */
public class dinhNghiaFactory {
    public static dinhNghia taodinhNghia(String loai,String giaTri,String tu,String nghia){
        switch (loai) {
            case "--Danh từ": case "-n": return new danhTu(giaTri, tu, nghia);
            case "--Tính từ": case "-a": return new tinhTu(giaTri, tu, nghia);
            case "--Động từ": case "-v": return new dongTu(giaTri, tu, nghia);
            case "--Đại từ nhân xưng": case "-p": return new daituNhanXung(giaTri);
            case "--Đồng nghĩa": case "-s": return new dongNghia(giaTri);
            default: throw new IllegalArgumentException("Invalid definition type: " + loai);
    }
}}

