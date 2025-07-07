/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.CaseStudy;

import java.util.List;

/**
 *
 * @author DUNG LE
 */
public class YeuCau {
    private String HanhDong;
    private List<String> TuVung;
    private String tuKhoa;

    public YeuCau(String HanhDong, List<String> TuVung, String tuKhoa) {
        this.HanhDong = HanhDong;
        this.TuVung = TuVung;
        this.tuKhoa = tuKhoa;
    }

    public String getHanhDong() {
        return HanhDong;
    }

    public void setHanhDong(String HanhDong) {
        this.HanhDong = HanhDong;
    }

    public List<String> getTuVung() {
        return TuVung;
    }

    public void setTuVung(List<String> TuVung) {
        this.TuVung = TuVung;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }
    
}
