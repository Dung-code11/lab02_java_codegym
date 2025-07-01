/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong18;

/**
 *
 * @author DUNG LE
 */
public class bt1 implements Runnable{
    @Override
    public void run(){
        int hash = this.hashCode();
        for (int i = 0; i <= 10; i++) {
                     System.out.println("Thread: " + Thread.currentThread().getName() +
                               " | Number: " + i +
                               " | Generator hashCode: " + hash);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        bt1 chuoi1 = new bt1();
        bt1 chuoi2 = new bt1();
        Thread thread1 = new Thread(chuoi1);
        Thread thread2 = new Thread(chuoi2);
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");
        
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        
        thread1.start();
        thread2.start();
        
    }
}
