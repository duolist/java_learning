package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedSequenceTest {

    @Test
    void reverse() {
        assertArrayEquals(new int[]{5,4,3,2,1},ReversedSequence.reverse(5));
    }
}