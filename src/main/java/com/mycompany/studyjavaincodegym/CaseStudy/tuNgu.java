/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.CaseStudy;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author DUNG LE
 */
public class tuNgu implements Serializable{
    private String tuKhoa;
    private LinkedList<dinhNghia> nghias = new LinkedList<>();
    public tuNgu(String tukhoa){
        this.tuKhoa = tukhoa;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }
    public void adđinhNghia(dinhNghia nghia){
        nghias.add(nghia);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@").append(tuKhoa).append("\n");
        for(dinhNghia nghia : nghias){
            sb.append(nghia).append("\n");
        }
        return sb.toString();
    }
    
}
