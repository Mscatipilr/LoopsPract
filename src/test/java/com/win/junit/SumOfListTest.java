package com.win.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfListTest {
    @DisplayName("Test sumOfList() method")
    @BeforeAll
    public static void setUp() {

    }

    @Test
    void sumOfListTest() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(6, SumOfList.sumOfList(list));
    }

    @AfterEach
    void tearDown() {
    }
}
