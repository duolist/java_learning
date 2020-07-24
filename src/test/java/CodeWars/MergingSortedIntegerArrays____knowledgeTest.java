package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergingSortedIntegerArrays____knowledgeTest {

    @Test
    void mergeArrays() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, MergingSortedIntegerArrays____knowledge.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 }, MergingSortedIntegerArrays____knowledge.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));

    }
}