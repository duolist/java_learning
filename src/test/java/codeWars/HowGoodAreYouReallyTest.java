package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class KataExampleTests {
    @Test
    public void tests() {
        assertEquals(true, HowGoodAreYouReally_000.betterThanAverage(new int[] {2, 3}, 5));
        assertEquals(true, HowGoodAreYouReally_000.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, HowGoodAreYouReally_000.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, HowGoodAreYouReally_000.betterThanAverage(new int[] {100, 90}, 11));
    }
}