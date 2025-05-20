/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong5;

/**
 *
 * @author DUNG LE
 */
public class bt2 {
    private String name = "John";
    private String classes = "C02";

    public bt2() {
    }
    public  bt2(String n , String c){
        this.name =n;
        this.classes = c;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void displayinfo(){
        System.out.println("Name " + name);
        System.out.println("Class: " + classes);
    }
    
}
