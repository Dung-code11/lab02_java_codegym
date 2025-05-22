/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong6.bt2;

/**
 *
 * @author DUNG LE
 */
public class Point3D extends Point2D{
    private float z =0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y,float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void SetXYZ(float x,float y,float z){
        setXY(x, y);
        this.z=z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),getZ()};
    }

    @Override
    public String toString() {
       return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
    
}
