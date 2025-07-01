/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong22.bt1;

/**
 *
 * @author DUNG LE
 */
public class Client {
public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        
        try {
            String url = "https://example.com/sample.pdf"; // Replace with a real file URL
            String destination = "sample_downloaded.pdf";
            downloader.download(url, destination);
        } catch (Exception e) {
            System.out.println("Error downloading file: " + e.getMessage());
        }
    }
}