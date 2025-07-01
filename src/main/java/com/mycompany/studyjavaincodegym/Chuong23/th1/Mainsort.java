/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong23.th1;

/**
 *
 * @author DUNG LE
 */
public class Mainsort {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("Java");
        sortedList.add("PHP");
        sortedList.add("C#");
        sortedList.add("Python");
        
        sortedList.setSortStrategy(new Quicksort());
        sortedList.sort();
        
        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}
