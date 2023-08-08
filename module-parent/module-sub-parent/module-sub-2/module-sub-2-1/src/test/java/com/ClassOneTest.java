package com;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassOneTest {
    @Test
    public void testAdd() {
        ClassOne classOne = new ClassOne();
        assertEquals(5, classOne.add(2, 3));
    }
}
