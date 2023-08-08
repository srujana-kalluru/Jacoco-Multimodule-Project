package com;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassTwoTest {
    @Test
    public void testConcatenate() {
        ClassTwo classTwo = new ClassTwo();
        assertEquals("HelloWorld", classTwo.concatenate("Hello", "World"));
    }
}
