package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WillYouMakeItTest {

    @Test
    void zeroFuel() {
        assertTrue(WillYouMakeIt.zeroFuel(50, 25, 2));
        assertFalse(WillYouMakeIt.zeroFuel(100, 50, 1));
    }
}