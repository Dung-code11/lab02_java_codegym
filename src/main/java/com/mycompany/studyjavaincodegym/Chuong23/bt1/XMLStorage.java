/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong23.bt1;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DUNG LE
 */
public class XMLStorage implements UserStorage{

    @Override
    public void store(User user) {
        try (FileWriter writer =new FileWriter("user.xml",true)){
            writer.write("<user>\n");
            writer.write("\t<name>"+user.getName()+"</name>\n");
            writer.write("\t<email>"+user.getEmail()+"</email>\n");
            writer.write("</user>\n");
            System.out.println("User saved to XML.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
