/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.chuong5;

/**
 *
 * @author DUNG LE
 */
public class th2 {
    private String name;
    private String engine;
    public static int numberofcars;
    public th2(String name,String engine){
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberofcars() {
        return numberofcars;
    }

    public static void setNumberofcars(int numberofcars) {
        th2.numberofcars = numberofcars;
    }
    public class main{
        public static void main(String[] args) {
            th2 car1 = new th2("Mazda 3","Skyactiv 3");
            System.out.println(th2.numberofcars);
            th2 car2 = new th2("Mazda 6","Skyactiv 6");
            System.out.println(th2.numberofcars);
        }
            }
}
