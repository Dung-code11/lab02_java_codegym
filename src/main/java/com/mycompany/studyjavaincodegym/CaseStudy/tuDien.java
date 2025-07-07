/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.CaseStudy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author DUNG LE
 */
public class tuDien {
    private static tuDien viDu;
    private final Map<String,tuNgu> tudien = new TreeMap<>();
    private final String thuMuc = "dict_data";
    private tuDien(){
        new File(thuMuc).mkdir();
    }
    public  static tuDien getVidu(){
        if(viDu == null) viDu = new tuDien();
        return viDu;
    }
    public void traCuu(YeuCau yc){
        tuNgu tungu = tudien.get(yc.getTuKhoa());
        if(tungu != null){
            System.out.println(tungu);
        } else{
            System.out.println("@" + yc.getTuKhoa()+ " not found.");
        }
    }
    public void dinhNghia(YeuCau yc){
        String loai = yc.getTuVung().get(0);
        String tra = yc.getTuVung().get(1);
        String tu = yc.getTuVung().size() > 2 ? yc.getTuVung().get(2) : "";
        String nghia = yc.getTuVung().size() > 3 ? yc.getTuVung().get(3) : "";
        tuNgu tungu = tudien.computeIfAbsent(yc.getTuKhoa(), k -> {
            System.out.println("@" + k + " is not existed in database, created new one!");
            return new tuNgu(k);
        });
        dinhNghia dinhnghia = dinhNghiaFactory.taodinhNghia(loai, tra, tu, nghia);
        tungu.adđinhNghia(dinhnghia);
        System.out.println("Lưu !");
    }
    public void xoa(YeuCau yc){
        if(tudien.remove(yc.getTuKhoa()) !=null){
            File file = new File(thuMuc + "/" + yc.getTuKhoa() + ".def");
            file.delete();
            System.out.println("@" + yc.getTuKhoa() + " dropped!");
        }else{
             System.out.println("@" + yc.getTuKhoa() + " not found.");
        }
    }
     public void export(YeuCau req) {
        String path = req.getTuKhoa();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            int percent = 0, total = tudien.size(), count = 0;
            for (Map.Entry<String, tuNgu> entry : tudien.entrySet()) {
                writer.write(entry.getValue().toString());
                writer.newLine();
                count++;
                int p = count * 100 / total;
                if (p >= percent + 10) {
                    percent = p;
                    System.out.print(percent + "%..");
                }
            }
            System.out.println("Done!");
        } catch (IOException e) {
            System.out.println("Export failed: " + e.getMessage());
        }
    }

    public void loadFromDisk() {
        File folder = new File(thuMuc);
        if (!folder.exists()) return;
        for (File file : folder.listFiles()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                tuNgu word = (tuNgu) ois.readObject();
                tudien.put(word.getTuKhoa(), word);
            } catch (Exception e) {
                System.out.println("Failed to load: " + file.getName());
            }
        }
    }

    public void saveToDisk() {
        for (tuNgu word : tudien.values()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(thuMuc + "/" + word.getTuKhoa()+ ".def"))) {
                oos.writeObject(word);
            } catch (IOException e) {
                System.out.println("Failed to save: " + word.getTuKhoa());
            }
        }
    }
}

