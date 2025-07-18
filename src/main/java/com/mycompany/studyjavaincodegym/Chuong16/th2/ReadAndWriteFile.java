/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong16.th2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUNG LE
 */
public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
    List<Integer> numbers = new ArrayList<>();
    try {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = br.readLine()) != null) {
            numbers.add(Integer.parseInt(line));
        }
        br.close();
    } catch (Exception e) {
        System.err.println("Fie không tồn tại or nội dung có lỗi!");
    }
    return numbers;
}
    public void writeFile(String filePath, int max){
    try {
        FileWriter writer = new FileWriter(filePath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("Giá trị lớn nhất là: " + max);
        bufferedWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    public static int findMax(List<Integer> numbers) {
    int max = numbers.get(0);
    for (int i = 0; i < numbers.size(); i++) {
        if (max < numbers.get(i)) {
            max = numbers.get(i);
        }
    }
    return max;
}
    public static void main(String[] args) {
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
    int maxValue = findMax(numbers);
    readAndWriteFile.writeFile("result.txt", maxValue);
}
}
