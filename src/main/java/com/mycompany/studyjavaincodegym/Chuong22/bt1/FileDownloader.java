/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong22.bt1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author DUNG LE
 */
public class FileDownloader implements Downloader{
    private String userAgent;
    public FileDownloader(String userAgent){
        this.userAgent = userAgent;
    }

    @Override
    public void download(String urlStr, String destinationFile) throws Exception {
        URL url = new URL(urlStr);
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User Agent", userAgent);
        try (InputStream in = connection.getInputStream();
             FileOutputStream out =new FileOutputStream(destinationFile)){
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("Download completed: " + destinationFile);
        }
    }
    }
    

