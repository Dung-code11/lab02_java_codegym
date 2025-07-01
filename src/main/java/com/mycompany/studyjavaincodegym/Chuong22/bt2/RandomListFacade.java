/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong22.bt2;

import java.util.List;

/**
 *
 * @author DUNG LE
 */
public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade() {
        this.randomList = new RandomList();
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
    }

    public void printRandomEvenList() {
        List<Integer> list = randomList.generateList(2,3,5);
        List<Integer> evenList = listFilter.filterOdd(list);
        listPrinter.printList(evenList);
    }
}
