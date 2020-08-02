package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsItEvenTest {

    @Test
    void isEven() {

        assertEquals(true, IsItEven.isEven(0.0));
        assertEquals(false, IsItEven.isEven(0.5));
        assertEquals(false, IsItEven.isEven(1));
        assertEquals(true, IsItEven.isEven(2));
        assertEquals(true, IsItEven.isEven(-4));
    }
}