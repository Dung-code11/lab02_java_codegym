/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong23.bt1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DUNG LE
 */
public class MySQLStorage implements UserStorage{
    @Override
    public void store(User user) {
        String url = "jdbc:mysql://localhost:3306/myapp";
        String username = "root";
        String password = "your_password"; // 🔐 Sửa lại theo CSDL của bạn

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.executeUpdate();
            System.out.println("User saved to MySQL.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
