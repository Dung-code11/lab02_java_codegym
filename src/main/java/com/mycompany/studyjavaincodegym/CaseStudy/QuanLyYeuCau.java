/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.CaseStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 *
 * @author DUNG LE
 */
public class QuanLyYeuCau {
    private final tuDien td;
    private final Map<String, Consumer<YeuCau>> lsHanhDong;
    public QuanLyYeuCau(tuDien td){
        this.td = td;
        lsHanhDong = new HashMap<>();
        lsHanhDong.put("Tra Cứu",td::traCuu);
        lsHanhDong.put("Định Nghĩa", td::dinhNghia);
        lsHanhDong.put("Xoá", td::xoa);
        lsHanhDong.put("export", td::export);
    }
    public void xuLy(YeuCau yc){
        Consumer<YeuCau> hanhDong = lsHanhDong.get(yc.getHanhDong());
        if(hanhDong !=null) hanhDong.accept(yc);
        else System.out.println("Unknown action: " + yc.getHanhDong());
    }
}
