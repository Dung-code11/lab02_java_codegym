/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong22.bt3;

/**
 *
 * @author DUNG LE
 */
import vn.codegym.collection.ListUtils;
import java.util.*;

public class CollectionUtilsAdapter implements SetProcessor {

    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> numberList = new ArrayList<>(numbers);
        return ListUtils.findMax(numberList); // Gọi thư viện
    }
}

