/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyjavaincodegym.Chuong9.bt3;

/**
 *
 * @author DUNG LE
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.convert(9));
    }

    @Test
    public void testDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.convert(10));
    }

    @Test
    public void testDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.convert(15));
    }

    @Test
    public void testContains3() {
        assertEquals("Fizz", FizzBuzz.convert(13));
    }

    @Test
    public void testContains5() {
        assertEquals("Buzz", FizzBuzz.convert(52));
    }

    @Test
    public void testContains3And5() {
        assertEquals("FizzBuzz", FizzBuzz.convert(53));
    }

    @Test
    public void testNormalNumber() {
        assertEquals("hai sáu", FizzBuzz.convert(26));
    }

    @Test
    public void testEdgeCase1() {
        assertEquals("một", FizzBuzz.convert(1));
    }

    @Test
    public void testEdgeCase99() {
        assertEquals("chín chín", FizzBuzz.convert(99));
    }
}
