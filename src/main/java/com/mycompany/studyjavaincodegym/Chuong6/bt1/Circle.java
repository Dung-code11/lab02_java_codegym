/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong6.bt1;

/**
 *
 * @author DUNG LE
 */
public class Circle {
    private double radius;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius *radius*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + ", Area =" +getArea()+"}";
    }
    
}
