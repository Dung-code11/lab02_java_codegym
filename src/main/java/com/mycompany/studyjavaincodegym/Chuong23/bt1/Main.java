/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong23.bt1;

/**
 *
 * @author DUNG LE
 */
public class Main {
   public static void main(String[] args) {
        User user1 = new User("Alice", "alice@example.com");
        UserStorage xmlStorage = new XMLStorage();
        UserController controller1 = new UserController(xmlStorage);
        controller1.store(user1);
        
        User user2 = new User("Bob", "bob@example.com");
        UserStorage mysqlStorage = new MySQLStorage();
        UserController controller2 = new UserController(mysqlStorage);
        controller2.store(user2);
    } 
}
