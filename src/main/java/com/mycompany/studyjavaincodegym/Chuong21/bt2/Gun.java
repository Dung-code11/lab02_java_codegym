/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong21.bt2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUNG LE
 */
public class Gun {
    private int bulletCount=1000;

    public void fireInPool() {
        BulletPool pool = new BulletPool();
        List<Bullet> plist = new ArrayList<>();
        for(int i = 0; i < bulletCount; i++) {
            Bullet p = pool.newItem();
            p.setPosition(0);
            plist.add(p);
            for(int j=0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if(pp.getPosition() == 10) {
                    pool.freeItem(pp);
                    plist.remove(pp);
                }
            }
            System.out.println();
        }
    }

    public void fire() {
        List<Bullet> plist = new ArrayList<>();
        for(int i = 0; i < bulletCount; i++) {
            Bullet p = new Bullet();
            p.setPosition(0);
            plist.add(p);
            for(int j=0; j < plist.size(); j++) {
                Bullet pp=plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if(pp.getPosition() == 10) {
                    plist.remove(pp);
                }
            }
            System.out.println();
        }
    }
}
