/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong7.bt1;

/**
 *
 * @author DUNG LE
 */
public class SquarewwithColorable extends Shape implements Colorable{
     private double side;

    public SquarewwithColorable() {
        this.side = 1.0;
    }

    public SquarewwithColorable(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

   
    public double getArea() {
        return side * side;
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square with side = " + side;
    }
}
