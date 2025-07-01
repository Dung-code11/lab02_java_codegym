/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong23.th2;

/**
 *
 * @author DUNG LE
 */
public class TemplateMethodDemo {
    public static void main(String[] args) {
        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();
        System.out.println();
        Meal meal2 = new TacoMeal();
        meal2.doMeal();
    }
}
