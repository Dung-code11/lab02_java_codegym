/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong4;

/**
 *
 * @author DUNG LE
 */
public class bt3 {
    public static final int slow = 1;
     public static final int medium = 2;
      public static final int fast = 3;
      private int speed;
      private boolean on;
      private double radius;
      private String color;
      
      public bt3(){
          this.speed = slow;
          this.on = false;
          this.radius =5;
          this.color = "blue";
      }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
     public String tostring(){
        if (on) {
            return "Fan is on | Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off | Color: " + color + ", Radius: " + radius;
        }
     }
     public class TestFan {
    public static void main(String[] args) {
        // Fan 1
        bt3 fan1 = new bt3();
        fan1.setSpeed(bt3.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Fan 2
        bt3 fan2 = new bt3();
        fan2.setSpeed(bt3.medium);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Hiển thị thông tin
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
}
