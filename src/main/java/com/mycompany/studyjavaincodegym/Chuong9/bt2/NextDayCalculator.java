/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong9.bt2;

/**
 *
 * @author DUNG LE
 */
import java.time.LocalDate;

public class NextDayCalculator {

    /**
     * Trả về ngày tiếp theo dưới dạng chuỗi dd/mm/yyyy.
     */
    public static String getNextDay(int day, int month, int year) {
        // Tạo đối tượng LocalDate từ ngày, tháng, năm
        LocalDate currentDate = LocalDate.of(year, month, day);
        
        // Cộng thêm 1 ngày
        LocalDate nextDate = currentDate.plusDays(1);
        
        // Trả kết quả dạng dd/mm/yyyy
        return String.format("%d/%d/%d", 
                             nextDate.getDayOfMonth(), 
                             nextDate.getMonthValue(), 
                             nextDate.getYear());
    }

    // Hàm main để chạy thử
    public static void main(String[] args) {
        System.out.println(getNextDay(1, 1, 2018));     // 2/1/2018
        System.out.println(getNextDay(31, 1, 2018));    // 1/2/2018
        System.out.println(getNextDay(30, 4, 2018));    // 1/5/2018
        System.out.println(getNextDay(28, 2, 2018));    // 1/3/2018
        System.out.println(getNextDay(29, 2, 2020));    // 1/3/2020 (năm nhuận)
        System.out.println(getNextDay(31, 12, 2018));   // 1/1/2019
    }
}

