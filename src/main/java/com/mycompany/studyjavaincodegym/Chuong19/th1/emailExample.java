/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong19.th1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DUNG LE
 */
public class emailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String email_regex =    "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public emailExample(){
        pattern = Pattern.compile(email_regex);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
