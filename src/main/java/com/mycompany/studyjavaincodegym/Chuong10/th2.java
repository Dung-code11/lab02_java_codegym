/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong10;

/**
 *
 * @author DUNG LE
 */
public class th2 {
    private  Node head;
     private  int numNodes;
 
     public th2(Object data) {
         head = new Node(data);
         numNodes++;
     }
     private class Node {
         private Node next;
         private Object data;
 
         public Node(Object data) {
             this.data = data;
         }
 
         public Object getData() {
             return this.data;
         }
     }
     public void add(int index, Object data) {
     Node temp = head;
     Node holder;

     for(int i=0; i < index-1 && temp.next != null; i++) {
         temp = temp.next;
     }
    holder = temp.next;
     temp.next = new Node(data);
     temp.next.next = holder;
     numNodes++;
 }
     public void addFirst(Object data) {
     Node temp = head;
     head = new Node(data);
     head.next = temp;
     numNodes++;
 }
     public Node get(int index){
     Node temp=head;
     for(int i=0; i<index; i++) {
         temp = temp.next;
     }
     return temp;
 }
     public void printList() {
     Node temp = head;
     while(temp != null) {
         System.out.println(temp.data);
         temp = temp.next;
     }
 } 
     public class TestMyLinkedList {
     public static void main(String[] args) {
         System.out.println("/=/=/=/= TESTING /=/=/=/=");
         th2 ll = new th2(10);
         ll.addFirst(11);
         ll.addFirst(12);
         ll.addFirst(13);
 
         ll.add(4,9);
         ll.add(4,9);
         ll.printList();
     }
 }
}
