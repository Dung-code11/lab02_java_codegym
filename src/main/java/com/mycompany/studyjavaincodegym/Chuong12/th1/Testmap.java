/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong12.th1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author DUNG LE
 */
public class Testmap {
    public static void main(String[] args) {
        Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("Smith",30);
        hashmap.put("Anderson", 31);
        hashmap.put("Levis",29);
        hashmap.put("Cook", 29); 
        System.out.println("Display entries in HashMap");
        System.out.println(hashmap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashmap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29); 
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        
    }
}
