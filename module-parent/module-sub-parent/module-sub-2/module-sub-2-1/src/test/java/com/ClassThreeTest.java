package com;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClassThreeTest {
    @Test
    public void testIsEven() {
        ClassThree classThree = new ClassThree();
        assertTrue(classThree.isEven(4));
    }
}
