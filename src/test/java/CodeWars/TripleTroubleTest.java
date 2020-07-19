package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripleTroubleTest {

    @Test
    void tripleTrouble() {

        assertEquals("ttlheoiscstk", TripleTrouble.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", TripleTrouble.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", TripleTrouble.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", TripleTrouble.tripleTrouble("LLh","euo","xtr"));
    }
}