/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong12.bt1;

/**
 *
 * @author DUNG LE
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo ID");
            System.out.println("3. Xoá sản phẩm theo ID");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Sắp xếp tăng dần theo giá");
            System.out.println("7. Sắp xếp giảm dần theo giá");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine(); // bỏ dòng thừa

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Giá: ");
                    double price = sc.nextDouble();
                    manager.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.print("ID sản phẩm cần sửa: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Giá mới: ");
                    double newPrice = sc.nextDouble();
                    if (!manager.updateProduct(updateId, newName, newPrice)) {
                        System.out.println("Không tìm thấy sản phẩm!");
                    }
                    break;
                case 3:
                    System.out.print("ID sản phẩm cần xoá: ");
                    int deleteId = sc.nextInt();
                    if (!manager.deleteProduct(deleteId)) {
                        System.out.println("Không tìm thấy sản phẩm!");
                    }
                    break;
                case 4:
                    manager.displayProducts();
                    break;
                case 5:
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = sc.nextLine();
                    manager.searchByName(keyword);
                    break;
                case 6:
                    manager.sortByPriceAscending();
                    System.out.println("Đã sắp xếp tăng dần theo giá.");
                    break;
                case 7:
                    manager.sortByPriceDescending();
                    System.out.println("Đã sắp xếp giảm dần theo giá.");
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
