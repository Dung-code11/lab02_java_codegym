/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong22.th2;

/**
 *
 * @author DUNG LE
 */
public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedIn) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }

    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.Share();
        this.facebook.Share();
        this.facebook.Share();
    }
}
