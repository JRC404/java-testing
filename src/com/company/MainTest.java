package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// if I don't import test, beforeEach and AfterEach... I won't be able to use them...

import static org.junit.jupiter.api.Assertions.*;
// library of assertions

class MainTest {

    private Main main;

    @BeforeEach
    void setUp() {
        this.main = new Main();
    }

    @AfterEach
    void tearDown() {
        // reset values used in tests
    }

    @org.junit.jupiter.api.Test
    void add() {
        float numberOne = 41;
        float numberTwo = 44;
        float expected = 85;
        float actual;

        actual = this.main.add(numberOne, numberTwo);
        assertEquals(expected, actual);
    }

    @Test
    void myNextTest() {
        String[] expectedOutput = {"Dean", "Jepson", "Bourne"};
        String[] methodOutput = {"Dean", "Jepson", "Bourne"};
        assertArrayEquals(expectedOutput, methodOutput);
    }

    @Test
    public void mutliplicationTest() {
//        Main test = new Main();
        assertEquals(1518, main.multiply(69, 22), "69 times 22 equals 1518");
        assertEquals(2000, main.multiply(50, 40), "2000 is expected");
    }
}