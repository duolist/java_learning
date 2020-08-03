package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthPowerTest {

    @Test
    void nthPower() {
        assertEquals(-1, NthPower.nthPower(new int[] {1,2}, 2));
        assertEquals(8, NthPower.nthPower(new int[] {3,1,2,2}, 3));
        assertEquals(4, NthPower.nthPower(new int[] {3,1,2}, 2));
    }
}