/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.CaseStudy;

/**
 *
 * @author DUNG LE
 */
public class dongTu extends danhTu{
     public dongTu(String giatri, String tu, String nghia) {
        super(giatri, tu, nghia);
        this.loaiTu = "Verb";
    }

    @Override
    public String toString() {
        return "* Động từ\n- " + giatri + (super.tu.isEmpty() ? "" :
            "\n= " + super.tu + "+ " + super.nghia);
    }
}
