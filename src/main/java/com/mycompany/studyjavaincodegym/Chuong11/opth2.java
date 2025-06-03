/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong11;

/**
 *
 * @author DUNG LE
 */
public class opth2 {
   private int arr[];
     private int size;
     private int index = 0;
 
     public opth2(int size) {
         this.size = size;
         arr = new int[size];
     }
     public void push(int element){    
  if (isFull()) {      
    throw new StackOverflowError("Stack is full");    
  }    
  arr[index] = element;    
  index++;
}
     public int pop() throws Exception {
   if (isEmpty()) { 
      throw new Exception("Stack is null");
  }
  return arr[--index];
}
     public int size() {
    return index;
}
     public boolean isEmpty() {
    if (index == 0) {
        return true;
    }
    return false;
}
    public boolean isFull() {
    if (index == size) {
        return true;
    }
    return false;
}
    public static void main(String[] as) throws Exception {
        opth2 stack = new opth2(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}
