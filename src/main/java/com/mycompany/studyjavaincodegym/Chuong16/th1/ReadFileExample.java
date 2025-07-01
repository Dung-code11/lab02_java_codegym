/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong16.th1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author DUNG LE
 */
public class ReadFileExample {
    public void readFileText(String filePath){
        try {
                File file = new File(filePath);
                if(!file.exists()){
                    throw new FileNotFoundException();
                }
                // Đọc từng dòng của file và tiến hành cộng tổng lại
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";
		int sum = 0;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			sum += Integer.parseInt(line);
		}
		br.close();
			
		// Hiển thị ra màn hình tổng các số nguyên trong file
		System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
