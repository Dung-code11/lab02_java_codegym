/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong3;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class th3 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner nhap = new Scanner(System.in);
        do{
            System.out.print("Enter a size: ");
            size = nhap.nextInt();
            if(size > 20)
                System.out.println("Size should not exceed 20");
        } while(size > 20);
        array = new int[size];
        int i = 0;
        while(i < array.length){
            System.out.print("Enter element" +(i+1)+ ":");
            array[i] = nhap.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for(int j = 0; j < array.length;j++){
            System.out.print(array[i] + "\t");
        }
        int max = array[0];
int index = 1;
for (int j = 0; j < array.length; j++) {
    if (array[j] > max) {
        max = array[j];
        index = j + 1;
    }
}
System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
