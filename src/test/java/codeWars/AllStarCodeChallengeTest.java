package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllStarCodeChallengeTest {

    @Test
    void strCount() {

        assertEquals(1, AllStarCodeChallenge.strCount("Hello", 'o'));
        assertEquals(2, AllStarCodeChallenge.strCount("Hello", 'l'));
        assertEquals(0, AllStarCodeChallenge.strCount("",'z'));
    }
}