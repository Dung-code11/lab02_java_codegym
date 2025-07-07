/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.CaseStudy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author DUNG LE
 */
public class dongNghia extends dinhNghia{
    private List<String> synonyms;

    public dongNghia(String giatri) {
        this.loaiTu = "Tương đồng";
        this.synonyms = Arrays.asList(giatri.split(","));
    }

    public String toString() {
        return "* Tương đồng\n- " + String.join("\n- ", synonyms);
    }
}

