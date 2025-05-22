/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong6.bt2;

/**
 *
 * @author DUNG LE
 */
public class main {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(3.5f, 4.5f);
        System.out.println(p2d.toString());
        p2d.setXY(1.1f, 2.2f);
        System.out.println("Updated Point2D: " +p2d);
        float[] coords2D = p2d.getXY();
        System.out.println("Coordinates: x = " + coords2D[0] + ", y = " + coords2D[1]);
        Point3D p3d = new Point3D(5.5f, 6.6f, 7.7f);
        System.out.println(p3d.toString());
        p3d.SetXYZ(9.9f, 8.8f, 7.7f);
        System.out.println("Updated Point3D: " +p3d);
        float[] coords3D = p3d.getXYZ();
        System.out.println("Coordinates: x = " + coords3D[0] + ", y = " + coords3D[1] + ", z = " + coords3D[2]);
    }
}
