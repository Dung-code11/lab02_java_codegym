/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.CaseStudy;

/**
 *
 * @author DUNG LE
 */
public class danhTu extends dinhNghia{
    public String tu;
    public String nghia;

    public danhTu(String giatri,String tu, String nghia) {
        this.loaiTu = "Danh Từ";
        this.giatri = giatri;
        this.tu = tu;
        this.nghia = nghia;
    }
    public String toString() {
        return "* Danh từ\n- " + giatri + (tu.isEmpty() ? "" :
            "\n= " + tu + "+ " + nghia);
    }
}
