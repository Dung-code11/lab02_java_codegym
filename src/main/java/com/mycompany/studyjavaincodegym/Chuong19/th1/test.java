/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong19.th1;

/**
 *
 * @author DUNG LE
 */
public class test {
    public static emailExample emExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String args[]) {
        emExample = new emailExample();
        for (String email : validEmail) {
            boolean isvalid = emExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
