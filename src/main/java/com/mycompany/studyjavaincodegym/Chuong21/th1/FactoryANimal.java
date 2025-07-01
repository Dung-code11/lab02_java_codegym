/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong21.th1;

/**
 *
 * @author DUNG LE
 */
public class FactoryANimal {
    public Animal getAnimal(String type){
        if("canie".equals(type)){
            return new Dog();
        }else{
            return new Cat();
        }
    }
}
