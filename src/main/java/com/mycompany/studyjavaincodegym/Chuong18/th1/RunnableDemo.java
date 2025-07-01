/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong18.th1;

/**
 *
 * @author DUNG LE
 */
public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;
    public RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating" + threadName);
    }
    @Override
    public void run(){
        System.out.println("Running " + threadName);
        try {
            for(int i = 4; i>0; i--){
                System.out.println("Thread: " +threadName+"," +i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +threadName+ "interrupted.");
        }
        System.out.println("Thread " +threadName+ "exiting.");
    }
    public void start(){
        System.out.println("Strating " +threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
