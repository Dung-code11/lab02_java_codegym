/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong23.th1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUNG LE
 */
public class SortedList {
    private SortStrategy strategy;
    private List<String> items = new ArrayList<>();
    
    public void setSortStrategy(SortStrategy strategy){
        this.strategy =strategy;
    }
    public void add(String name){
        items.add(name);
    }
    public void sort(){
        strategy.sort(items);
    }
}
