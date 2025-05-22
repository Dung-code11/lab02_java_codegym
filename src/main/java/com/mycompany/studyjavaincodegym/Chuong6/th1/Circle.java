/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong6.th1;

/**
 *
 * @author DUNG LE
 */
public class Circle extends shape{
    private double radius =1.0;

    public Circle() {
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public  String toString(){
        return "A Circle with radius =" +getRadius()+", which is a subclass of" + super.toString();
    }
}
