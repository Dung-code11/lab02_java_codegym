/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong17.bt1;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class Main {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        SanPhamManager manager = new SanPhamManager();
        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ SẢN PHẨM =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = nhap.nextInt();
            nhap.nextLine(); // bỏ \n

            switch (choice) {
                case 1:
                    System.out.print("Mã sản phẩm: ");
                    String ma = nhap.nextLine();
                    System.out.print("Tên sản phẩm: ");
                    String ten = nhap.nextLine();
                    System.out.print("Giá: ");
                    double gia = nhap.nextDouble();
                    nhap.nextLine(); // bỏ \n
                    System.out.print("Hãng sản xuất: ");
                    String hang = nhap.nextLine();
                    System.out.print("Mô tả: ");
                    String moTa = nhap.nextLine();

                    SanPham sp = new SanPham(ma, ten, gia, hang, moTa);
                    manager.themSanPham(sp);
                    break;
                case 2:
                    manager.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhập mã sản phẩm cần tìm: ");
                    String maTim = nhap.nextLine();
                    manager.timKiemTheoMa(maTim);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 0);
    }
    }
