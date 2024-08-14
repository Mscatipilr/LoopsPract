package com.win.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastItemTest {
    @DisplayName("Test lastItem() method")
    @BeforeAll
    public static void setUp() {

    }

    @Test
    void lastItemTest() {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        listOfStrings.add("Hello");
        listOfStrings.add("World");
        listOfStrings.add("Have");
        listOfStrings.add("foo");
        listOfStrings.add("bar");
        assertEquals("The last item in the list is: bar", LastItem.lastItem(listOfStrings));
    }

    @AfterEach
    void tearDown() {
    }
}
