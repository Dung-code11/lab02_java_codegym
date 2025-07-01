/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong21.bt2;

/**
 *
 * @author DUNG LE
 */
public class BulletPool extends MemoryPool<Bullet>{
    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}
