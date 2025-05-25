/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong7.bt1;

import java.util.Random;

/**
 *
 * @author DUNG LE
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapess = new Shape[3];
        Resizeable[] shapes = new Resizeable[5];

        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(6);
        shapes[3] = new Circle(2.5);
        shapes[4] = new Rectangle(2, 3);

        shapess[0] = new Circle(2.5);
        shapess[1] = new SquarewwithColorable(4.0);
        shapess[2] = new Rectangle(3.0, 5.0);

        Random rand = new Random();

        for (Resizeable shape : shapes) {
            double percent = 1 + rand.nextInt(100); // từ 1 đến 100
            double before = getArea(shape);
            System.out.printf("Before resize: Area = %.2f\n", before);
            shape.resize(percent);
            double after = getArea(shape);
            System.out.printf("After resize (%.0f%%): Area = %.2f\n\n", percent, after);
        }

        // ✅ Phải để bên trong main
        for (Shape s : shapess) {
            if (s instanceof Colorable) {
                ((Colorable) s).howtoColor();
            }
        }
    }

    // Phương thức lấy diện tích cho từng loại hình
    public static double getArea(Resizeable shape) {
        if (shape instanceof Circle) {
            return ((Circle) shape).getArea();
        } else if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getArea();
        } else if (shape instanceof Square) {
            return ((Square) shape).getArea();
        }
        return 0;
    }
}
