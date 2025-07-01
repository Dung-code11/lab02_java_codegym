/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong21.bt2;

/**
 *
 * @author DUNG LE
 */
public class Bullet {
    public static int count = 0 ;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public Bullet(){
        count++;
    }
    public void move(){
        position++;
    }
}
