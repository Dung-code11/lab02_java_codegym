/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong6.bt3;

/**
 *
 * @author DUNG LE
 */
public class main {
     public static void main(String[] args) {
         MoveablePoint mp = new MoveablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("Before move: " + mp);
        mp.move();
        System.out.println("After 1st move: " + mp);
        mp.move();
        System.out.println("After 2nd move: " + mp);
    }
}
