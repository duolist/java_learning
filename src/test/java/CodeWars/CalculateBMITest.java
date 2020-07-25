package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateBMITest {

    @Test
    void bmi() {
        assertEquals("Normal", CalculateBMI.bmi(80, 1.80));
    }
}