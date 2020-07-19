package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItsTooHotAndTheyCantEvenTest {

    @Test
    void divide() {

        assertTrue(ItsTooHotAndTheyCantEven.divide(4));
        assertFalse(ItsTooHotAndTheyCantEven.divide(2));
        assertFalse(ItsTooHotAndTheyCantEven.divide(5));
        assertTrue(ItsTooHotAndTheyCantEven.divide(88));
        assertTrue(ItsTooHotAndTheyCantEven.divide(100));
        assertFalse(ItsTooHotAndTheyCantEven.divide(67));
        assertTrue(ItsTooHotAndTheyCantEven.divide(90));
        assertTrue(ItsTooHotAndTheyCantEven.divide(10));
        assertFalse(ItsTooHotAndTheyCantEven.divide(99));
        assertTrue(ItsTooHotAndTheyCantEven.divide(32));
    }
}