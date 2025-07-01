/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong23.bt1;

/**
 *
 * @author DUNG LE
 */
public class UserController {
    private UserStorage storage;
    public UserController(UserStorage storage){
        this.storage =storage;
    }
    public void store(User user){
        storage.store(user);
    }
}
