/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong22.bt1;

/**
 *
 * @author DUNG LE
 */
public class FileDownloaderProxy implements Downloader {
    private static final String FIREFOX_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:108.0) Gecko/20100101 Firefox/108.0";
    private FileDownloader realDownloader;

    public FileDownloaderProxy() {
        this.realDownloader = new FileDownloader(FIREFOX_USER_AGENT);
    }

    @Override
    public void download(String urlStr, String destinationFile) throws Exception {
        System.out.println("Using Firefox User-Agent via Proxy");
        realDownloader.download(urlStr, destinationFile);
    }
}

