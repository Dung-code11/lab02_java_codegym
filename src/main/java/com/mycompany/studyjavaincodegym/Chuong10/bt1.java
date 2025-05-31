/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong10;

/**
 *
 * @author DUNG LE
 */
public class bt1<E> {
      private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public bt1() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public bt1(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removedElement = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return removedElement;
    }

    public int size() {
        return size;
    }

    public bt1<E> clone() {
        bt1<E> newList = new bt1<>(elements.length);
        for (int i = 0; i < size; i++) {
            newList.add((E) elements[i]);
        }
        return newList;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o == null ? elements[i] == null : o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, minCapacity);
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
    public class MyListTest {
    public static void main(String[] args) {
        bt1<Integer> list = new bt1<>();

        list.add(10);
        list.add(20);
        list.add(1, 15); // thêm vào vị trí 1

        System.out.println("List size: " + list.size());
        System.out.println("Element at 0: " + list.get(0));
        System.out.println("Element at 1: " + list.get(1));
        System.out.println("Element at 2: " + list.get(2));

        System.out.println("Contains 15? " + list.contains(15));
        System.out.println("Index of 20: " + list.indexOf(20));

        list.remove(1);
        System.out.println("After remove index 1, element at 1: " + list.get(1));

        bt1<Integer> clonedList = list.clone();
        System.out.println("Cloned list element at 0: " + clonedList.get(0));

        list.clear();
        System.out.println("List size after clear: " + list.size());
    }
}
}
