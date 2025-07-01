/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong23.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUNG LE
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;
    
    public void add(Observer o){
        observers.add(o);
    }
    
    public  int getState(){
        return state;
    }
    public void setState(int value){
        this.state = value;
        execute();
    }
    private void execute(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
