/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong11;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 *
 * @author DUNG LE
 */
public class th1<T> {
    private LinkedList<T> stack;
    public th1(){
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
    public static void stackOfIStrings(){
       th1<String> stack = new th1();
     stack.push("Five");
     stack.push("Four");
     stack.push("Three");
     stack.push("Two");
     stack.push("One");
     System.out.println("1.1 Size of stack after push operations: " + stack.size());
     System.out.printf("1.2. Pop elements from stack : ");
     while (!stack.isEmpty()) {
         System.out.printf(" %s", stack.pop());
     }
     System.out.println("\n1.3. Size of stack after pop operations : " + stack.size()); 
    }
    private static void stackOfIntegers() {
     th1<Integer> stack = new th1();
     stack.push(5);
     stack.push(4);
     stack.push(3);
     stack.push(2);
     stack.push(1);
     System.out.println("2.1. Size of stack after push operations: " + stack.size());
     System.out.printf("2.2. Pop elements from stack : ");
     while (!stack.isEmpty()) {
         System.out.printf(" %d", stack.pop());
     }
     System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
 }
    public static void main(String[] args) {
         System.out.println("1. Stack of integers");
         stackOfIntegers();
         System.out.println("\n2. Stack of Strings");
         stackOfIStrings();
     }
}
