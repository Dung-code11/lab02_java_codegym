/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong7.th2;

/**
 *
 * @author DUNG LE
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
        public ComparableCircle(){
            
        }
        public ComparableCircle(double radius){
            super(radius);
        }
        public ComparableCircle(double radius,String color,boolean filled){
            super(radius, color, filled);
        }
        @Override
        public int compareTo(ComparableCircle o){
            if(getRadius() > o.getRadius()) return 1;
            else if (getRadius() < o.getRadius()) return -1;
            else return 0;
        }

   
    }

