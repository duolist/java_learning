package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedStringsTest {

    @Test
    void solution() {
        assertEquals("dlrow", ReversedStrings.reversedStr("world"));
    }
}