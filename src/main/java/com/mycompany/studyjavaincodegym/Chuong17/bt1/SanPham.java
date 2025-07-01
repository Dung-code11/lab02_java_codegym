/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong17.bt1;

import java.io.Serializable;

/**
 *
 * @author DUNG LE
 */
public class SanPham implements Serializable{
    private String maSp;
    private String tenSP;
    private double gia;
    private String hangSX;
    private String moTa;

    public SanPham(String maSp, String tenSP, double gia, String hangSX, String moTa) {
        this.maSp = maSp;
        this.tenSP = tenSP;
        this.gia = gia;
        this.hangSX = hangSX;
        this.moTa = moTa;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    @Override
    public String toString() {
        return "Mã: " + maSp + ", Tên: " + tenSP + ", Giá: " + gia + ", Hãng: " + hangSX + ", Mô tả: " + moTa;
    }
}
