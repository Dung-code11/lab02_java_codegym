/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong12.bt1;

/**
 *
 * @author DUNG LE
 */
import java.util.*;

public class ProductManager {
    private LinkedList<Product> productList = new LinkedList<>();

    public void addProduct(Product p) {
        productList.add(p);
    }

    public boolean updateProduct(int id, String newName, double newPrice) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(int id) {
        return productList.removeIf(p -> p.getId() == id);
    }

    public void displayProducts() {
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    public void searchByName(String keyword) {
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    public void sortByPriceAscending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortByPriceDescending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
