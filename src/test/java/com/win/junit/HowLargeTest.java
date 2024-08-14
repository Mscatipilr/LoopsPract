package com.win.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HowLargeTest {
    @DisplayName("Test howLarge() method")
    @BeforeEach
    void setUp() {

    }
    @Test
    void howLargeTest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Goodday");
        list.add("foo");
        list.add("bar");

        assertEquals("The total amount of items in the list was: 5", HowLarge.howLarge(list));
    }
    @AfterEach
    void tearDown() {

    }

}
