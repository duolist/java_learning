package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class GrassHopperTest {
    @Test
    public void test1() {
        assertEquals(1,
                GrasshopperSummation.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                GrasshopperSummation.summation(8));
    }
}