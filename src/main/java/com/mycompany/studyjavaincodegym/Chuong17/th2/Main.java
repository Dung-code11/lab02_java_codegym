/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong17.th2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUNG LE
 */
public class Main {
   public static void writeDataToFile(String path, List<Student> students) {
    try {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        oos.close();
        fos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
   public static List<Student> readDataFromFile(String path){
    List<Student> students = new ArrayList<>();
    try{
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        students = (List<Student>) ois.readObject();
        fis.close();
        ois.close();
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return students;
}
   public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
    students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
    students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
    students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
    students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
    writeDataToFile("student.txt", students);
    List<Student> studentDataFromFile = readDataFromFile("student.txt");
    for (Student student : studentDataFromFile){
        System.out.println(student);
    }
}
}
