package com.win.junit;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FifthItemTest {
    @DisplayName("Test fifthItem() method")
    @BeforeAll
    public static void setUp() {

    }

    @Test
    void testFifthItem() {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        listOfStrings.add("Hello");
        listOfStrings.add("World");
        listOfStrings.add("plate");
        listOfStrings.add("cup");
        listOfStrings.add("baby");
        assertEquals("The fifth item in the list is: baby", FifthItem.fifthItem(listOfStrings));
    }

    @AfterEach
    void tearDown() {
    }

}
