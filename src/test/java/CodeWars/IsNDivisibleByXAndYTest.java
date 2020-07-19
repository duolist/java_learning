package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleNbTests {

    @Test
    public void test1() {
        assertEquals(true, IsNDivisibleByXAndY.isDivisible(12,4,3));
    }
    @Test
    public void test2() {
        assertEquals(false, IsNDivisibleByXAndY.isDivisible(3,3,4));
    }
}