/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong11.opbt4;

/**
 *
 * @author DUNG LE
 */
import java.util.LinkedList;
import java.util.Queue;

class NhanSu {
    String hoTen;
    String gioiTinh;  // "Nu" hoặc "Nam"
    String ngaySinh;  // Ví dụ "1990-12-25" (đã sắp xếp)

    public NhanSu(String hoTen, String gioiTinh, String ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return hoTen + " - " + gioiTinh + " - " + ngaySinh;
    }
}


