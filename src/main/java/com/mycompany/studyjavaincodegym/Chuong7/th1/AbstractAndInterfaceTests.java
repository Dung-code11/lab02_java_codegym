/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong7.th1;

import com.mycompany.studyjavaincodegym.Chuong7.th1.animal.Animal;
import com.mycompany.studyjavaincodegym.Chuong7.th1.animal.Chicken;
import com.mycompany.studyjavaincodegym.Chuong7.th1.animal.Tiger;
import com.mycompany.studyjavaincodegym.Chuong7.th1.edible.Edible;
import com.mycompany.studyjavaincodegym.Chuong7.th1.fruit.Apple;
import com.mycompany.studyjavaincodegym.Chuong7.th1.fruit.Fruit;
import com.mycompany.studyjavaincodegym.Chuong7.th1.fruit.Orange;

/**
 *
 * @author DUNG LE
 */
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            System.out.println(animal.makeSound());
            if( animal instanceof Chicken){
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
