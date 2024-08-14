package com.win.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexOfIntegerTest {
    @DisplayName("Test getIndex() method")
    @BeforeEach
    void setUp() {

    }
    @Test
    void getIndexTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(3);
        list.add(12);
        list.add(52);
        int num = 20;

        assertEquals("20 is at index 1", IndexOfInteger.getIndex(list, num));
    }
    @AfterEach
    void tearDown() {

    }
}
