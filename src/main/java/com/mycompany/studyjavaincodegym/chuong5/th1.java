/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong5;

/**
 *
 * @author DUNG LE
 */
public class th1 {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    th1(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + "" + name + "" +college);
    }
    public class main{
        public static void main(String[] args) {
            th1.change();
            th1 s1 = new th1(111,"Hoang");
            th1 s2 = new th1(222,"Khanh");
            th1 s3 = new th1(333,"Nam");
            
            s1.display();
            s2.display();
            s3.display();
        }
    }
}
