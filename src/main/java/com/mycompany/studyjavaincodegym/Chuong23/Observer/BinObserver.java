/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong23.Observer;

/**
 *
 * @author DUNG LE
 */
public class BinObserver extends Observer{
    public BinObserver(Subject subject){
        this.subject =subject;
        this.subject.add(this);
    }
    public void update(){
        System.out.println(""+Integer.toBinaryString(subject.getState()));
    }
    
}
