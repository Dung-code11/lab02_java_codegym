/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.studyjavaincodegym.Chuong9.bt1.TriangleClassifier;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DUNG LE
 */

public class TriangleClassifierTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("tam giác đều", TriangleClassifier.classify(2, 2, 2));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("tam giác cân", TriangleClassifier.classify(2, 2, 3));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("tam giác thường", TriangleClassifier.classify(3, 4, 5));
    }

    @Test
    public void testInvalidTriangle1() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(8, 2, 3));
    }

    @Test
    public void testInvalidTriangle2() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(-1, 2, 1));
    }

    @Test
    public void testInvalidTriangle3() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(0, 1, 1));
    }
}

