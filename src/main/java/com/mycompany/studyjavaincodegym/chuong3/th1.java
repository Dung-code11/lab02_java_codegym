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
public class th1 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner nhap = new Scanner(System.in);
        do{
            System.out.print("enter a size: ");
            size = nhap.nextInt();
            if(size > 20)
                System.out.println("Size does not exceed 20");
        }while ( size > 20);
        array = new int[size];
        int i = 0;
        while( i < array.length){
            System.out.println("Enter element " + (i+1) + ":");
            array[i] = nhap.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","Elements in array: ","");
        for(int j = 0;j<array.length;j++){
            System.out.println(array[j] + "\t");
        }
        for(int j = 0; j< array.length /2 ;j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s","reverse array: ","");
        for(int j = 0;j<array.length;j++){
            System.out.println(array[j]+"\t");
        }
    }
}
