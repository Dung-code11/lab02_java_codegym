/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong17.bt1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUNG LE
 */
public class SanPhamManager {
    private List<SanPham> ds = new ArrayList<>();
    private final String tenfile = "sanpham.dat";
    public void themSanPham(SanPham sp){
        ds.add(sp);
        ghifile();
    }
    public void hienThiDanhSach(){
        docfile();
        if(ds.isEmpty()){
            System.out.println("Danh Sách Sản Phẩm Trống: ");
        } else{
            for(SanPham sp : ds){
                System.out.println(sp);
            }
        }
    }
    public void timKiemTheoMa(String ma){
        docfile();
        boolean timthay = false;
        for(SanPham sp : ds){
            if(sp.getMaSp().equalsIgnoreCase(ma)){
                System.out.println("Tìm thấy: " +sp);
                timthay = true;
                break;
            }
        }
        if(!timthay){
            System.out.println("Không tìm thấy sản phẩm có mã: "+ ma);
        }
    }
    private void ghifile(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(tenfile))) {
            oos.writeObject(ds);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: "+e.getMessage());
        }
    }
    private void docfile(){
        File file = new File(tenfile);
        if(!file.exists()) return;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(tenfile))) {
            ds = (List<SanPham>) ois.readObject();
        }catch (Exception e) {
            System.out.println("Lỗi đọc file: " +e.getMessage());
        }
    }
}
