/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong7.th1.animal;

import com.mycompany.studyjavaincodegym.Chuong7.th1.edible.Edible;

/**
 *
 * @author DUNG LE
 */
public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
