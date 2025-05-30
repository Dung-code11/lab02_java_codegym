package com.mycompany.studyjavaincodegym.Chuong9.bt2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUNG LE
 */
import com.mycompany.studyjavaincodegym.Chuong9.bt2.NextDayCalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NextDayCalculatortest {

    @Test
    public void testNextDay_1_1_2018() {
        assertEquals("2/1/2018", NextDayCalculator.getNextDay(1, 1, 2018));
    }

    @Test
    public void testNextDay_31_1_2018() {
        assertEquals("1/2/2018", NextDayCalculator.getNextDay(31, 1, 2018));
    }

    @Test
    public void testNextDay_30_4_2018() {
        assertEquals("1/5/2018", NextDayCalculator.getNextDay(30, 4, 2018));
    }

    @Test
    public void testNextDay_28_2_2018() {
        assertEquals("1/3/2018", NextDayCalculator.getNextDay(28, 2, 2018));
    }

    @Test
    public void testNextDay_29_2_2020() {
        assertEquals("1/3/2020", NextDayCalculator.getNextDay(29, 2, 2020));
    }

    @Test
    public void testNextDay_31_12_2018() {
        assertEquals("1/1/2019", NextDayCalculator.getNextDay(31, 12, 2018));
    }
}
