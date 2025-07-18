/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong11;

/**
 *
 * @author DUNG LE
 */
public class opth1 {
   private int capacity;
   private int queueArr[];
   private int head = 0;
   private int tail = -1;
   private int currentSize = 0;
    public opth1(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull(){
     boolean status = false;
     if (currentSize == capacity){
         status = true;
     }
     return status;
 }
    public boolean isQueueEmpty(){
     boolean status = false;
     if (currentSize == 0){
         status = true;
     }
     return status;
 }
    public void enqueue(int item) {
    if (isQueueFull()) {
        System.out.println("Overflow ! Unable to add element: " + item);
    } else {
        tail = (tail + 1) % capacity;
        queueArr[tail] = item;
        currentSize++;
        System.out.println("Element " + item + " is pushed to Queue !");
    }
}
    public void dequeue() {
    if (isQueueEmpty()) {
        System.out.println("Underflow ! Unable to remove element from Queue");
    } else {
        head++;
        if (head == capacity - 1) {
            System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            head = 0;
        } else {
            System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
        }
        currentSize--;
    }
}
    public static void main(String[] args) {
     opth1 queue = new opth1(4);
     queue.enqueue(4);
     queue.dequeue();
     queue.enqueue(56);
     queue.enqueue(2);
     queue.enqueue(67);
     queue.dequeue();
     queue.dequeue();
     queue.enqueue(24);
     queue.dequeue();
     queue.enqueue(98);
     queue.enqueue(45);
     queue.enqueue(23);
     queue.enqueue(435);
 }
}
