/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong23.th2;

/**
 *
 * @author DUNG LE
 */
public abstract class Meal {
    public final void doMeal(){
        preareIngreients();
        cook();
        eat();
        cleanUP();
    }
    public abstract void   preareIngreients();
    public abstract void cook();
    public void eat(){
        System.out.println("MMM,That's so good");
    }
    public abstract void cleanUP();
}
