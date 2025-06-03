package com.mycompany.studyjavaincodegym.Chuong11;

public class bt3 {

    // Node không cần public vì chỉ dùng nội bộ
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class CircularQueue {
        private Node front = null;
        private Node rear = null;

        // Thêm phần tử vào hàng đợi
        public void enQueue(int value) {
            Node newNode = new Node(value); // B1: Tạo node mới

            if (front == null) { // B2: Kiểm tra hàng đợi trống
                front = rear = newNode;
                rear.next = front; // Trỏ về chính nó
            } else {
                rear.next = newNode;  // rear trỏ đến node mới
                rear = newNode;       // cập nhật rear là node mới
                rear.next = front;    // rear trỏ lại về front
            }
        }

        
        public int deQueue() {
            if (front == null) {
                System.out.println("Queue is empty!");
                return -1;
            }

            int value;
            if (front == rear) { // Chỉ có một phần tử
                value = front.data;
                front = rear = null;
            } else {
                value = front.data;
                front = front.next;
                rear.next = front;
            }

            return value;
        }


        public void displayQueue() {
            if (front == null) {
                System.out.println("Queue is empty!");
                return;
            }

            System.out.print("Queue elements: ");
            Node temp = front;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != front);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.displayQueue(); // 10 20 30

        queue.deQueue(); // Xoá 10
        queue.displayQueue(); // 20 30

        queue.enQueue(40);
        queue.displayQueue(); // 20 30 40
    }
}
