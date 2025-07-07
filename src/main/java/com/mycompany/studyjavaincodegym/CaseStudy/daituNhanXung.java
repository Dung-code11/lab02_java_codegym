/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.CaseStudy;

/**
 *
 * @author DUNG LE
 */
public class daituNhanXung extends dinhNghia {
    public daituNhanXung(String giatri) {
        this.loaiTu = "Phát âm";
        this.giatri = giatri;
    }

    public String toString() {
        return "/" + giatri + "/";
    }
}
