package com.mycompany.studyjavaincodegym.Chuong10;

import java.util.Arrays;

public class th1 {

    public static class MyList<E> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private Object[] elements;

        public MyList() {
            elements = new Object[DEFAULT_CAPACITY];
        }

        private void ensureCapa() {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }

        public void add(E e) {
            if (size == elements.length) {
                ensureCapa();
            }
            elements[size++] = e;
        }

        public E get(int i) {
            if (i >= size || i < 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
            }
            return (E) elements[i];
        }
    }

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));

        // Kiểm tra phần tử không tồn tại
        try {
            System.out.println("element 6: " + listInteger.get(6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
