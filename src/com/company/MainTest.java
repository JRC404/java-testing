package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main nameArray;
    private Main add;

    @BeforeEach
    void setUp() {
        this.add = new Main();
        this.nameArray = new Main();
    }


    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {

    }


    @Test
    void add() {
        float number1 = 10;
        float number2 = 20;
        float expected = 30;
        float actual;

        actual = this.add.add(number1, number2);
        assertEquals(expected, actual, 0.000);
    }
}