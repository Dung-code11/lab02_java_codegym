/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong18.bt2;

/**
 *
 * @author DUNG LE
 */
public class soChan extends Thread{
    @Override
    public void run(){
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("Số Chẵn: " +i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}
