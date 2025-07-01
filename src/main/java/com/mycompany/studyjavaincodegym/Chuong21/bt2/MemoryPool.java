/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong21.bt2;

import java.util.LinkedList;

/**
 *
 * @author DUNG LE
 */
public abstract class MemoryPool<T> {
    private LinkedList<T> free_items = new LinkedList<>();

    public void freeItem(T item) {
        free_items.add(item);
    }

    protected abstract T allocate();

    public T newItem() {
        T out = null;
        if (free_items.size() == 0) {
            out = allocate();
        } else {
            out = free_items.getFirst();
            free_items.removeFirst();
        }
        return out;
    }
}
