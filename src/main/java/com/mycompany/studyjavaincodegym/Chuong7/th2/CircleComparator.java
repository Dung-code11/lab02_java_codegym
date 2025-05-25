/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong7.th2;

import java.util.Comparator;

/**
 *
 * @author DUNG LE
 */
public class CircleComparator  implements Comparator<Circle>{
    @Override
    public int compare(Circle c1,Circle c2){
        if(c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
