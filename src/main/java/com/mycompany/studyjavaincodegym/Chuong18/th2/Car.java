/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong18.th2;

import java.util.Random;

/**
 *
 * @author DUNG LE
 */
public class Car implements Runnable{
    private String nameCar;

    public Car(String nameCar) {
        this.nameCar = nameCar;
    }
    
    @Override
    public void run(){
        int runDistance = 0 ;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt();
                runDistance += speed;
                String log = "|";
                int percentTravel = (runDistance * 100)/DISTANCE;
                for(int i = 0 ;i< DISTANCE; i += STEP){
                    if(percentTravel >= i + STEP){
                        log += "=";
                    }else if (percentTravel >= i && percentTravel < i + STEP){
                        log += "o";
                    }
                    else{
                        log += "-";
                            }
                }
                log +="|";
                System.out.println("Car" + this.nameCar + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.nameCar + " broken...");
                break;
            }
        }
            long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.nameCar + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
    public static int DISTANCE = 100;
    public static int STEP = 2;
            public static void main(String[] args) {
            Car carA = new Car("A");
            Car carB = new Car("B");
            Car carC = new Car("C");

            Thread thread1 = new Thread(carA);
            Thread thread2 = new Thread(carB);
            Thread thread3 = new Thread(carC);

            System.out.println("Distance: 100KM");
            thread1.start();
            thread2.start();
            thread3.start();
        }
}
