package com.mycompany.studyjavaincodegym.Chuong22.bt2;

public class RandomNumber {
    public int generateInteger(int min, int max){
        double randomDouble = Math.random();
        int randomInteger =  (int) (randomDouble * (max - min + 1) + min);
        return randomInteger;
    }
}