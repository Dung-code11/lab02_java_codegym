/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DUNG LE
 */
public class baitapnangcao {
    public static void main(String[] args) {
        try {
            String urlString = "https://nhandan.vn/";
            URL url = new URL(urlString);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder html = new StringBuilder();
            String inputLine;
            while((inputLine = in.readLine())!= null){
                html.append(inputLine);
            }
            in.close();
            String regex = "<a href=\"(.*?)\">(.*?)</a>";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(html.toString());

            System.out.println("Danh sách bản tin:");
            while (matcher.find()) {
                String link = matcher.group(1);
                String title = matcher.group(2);
                System.out.println("- " + title + " (Link: " + link + ")");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
