/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong23.th2;

/**
 *
 * @author DUNG LE
 */
public class HamburgerMeal extends Meal{

    @Override
    public void preareIngreients() {
        System.out.println("Getting burgers,buns, and french fries");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burgers on grill and fries in oven");
    }

    @Override
    public void cleanUP() {
        System.out.println("Throwing away paper plates");
    }

    
    
}
