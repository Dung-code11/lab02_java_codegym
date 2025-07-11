/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong12.th3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author DUNG LE
 */
public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
   Student student = new Student("Kien", 30, "HT");
   Student student1 = new Student("Nam", 26, "HN");
   Student student2 = new Student("Anh", 38, "HT" );
   Student student3 = new Student("Tung", 38, "HT" );

        List<Student> lists = new ArrayList<Student>();
   lists.add(student);
   lists.add(student1);
   lists.add(student2);
   lists.add(student3);
        Collections.sort(lists);
   for(Student st : lists){
       System.out.println(st.toString());
   }

   AgeComparator ageComparator = new AgeComparator();
   Collections.sort(lists,ageComparator);
   System.out.println("So sanh theo tuoi:");
   for(Student st : lists){
       System.out.println(st.toString());
   }
  }
}
