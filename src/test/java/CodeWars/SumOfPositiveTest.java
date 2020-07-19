package CodeWars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfPositiveTest {

    @Test
    public void sum() {
        assertEquals(15, SumOfPositive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, SumOfPositive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, SumOfPositive.sum(new int[]{}));
        assertEquals(0, SumOfPositive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, SumOfPositive.sum(new int[]{-1,2,3,4,-5}));
    }
}