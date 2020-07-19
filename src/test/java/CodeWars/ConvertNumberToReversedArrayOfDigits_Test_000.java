package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertNumberToReversedArrayOfDigits_Test_000 {

    @Test
    void digitize() {

        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, ConvertNumberToReversedArrayOfDigits_000.digitize(35231));
        assertArrayEquals(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1}, ConvertNumberToReversedArrayOfDigits_000.digitize(123456789));
        assertArrayEquals(new int[] {0, 0, 0, 1}, ConvertNumberToReversedArrayOfDigits_000.digitize(1000));
        assertArrayEquals(new int[] {6, 6, 6}, ConvertNumberToReversedArrayOfDigits_000.digitize(-666));
        assertArrayEquals(new int[] {1, 0, 1}, ConvertNumberToReversedArrayOfDigits_000.digitize(-101));
        assertArrayEquals(new int[] {5, 3, 2, 8, 7, 4, 5, 9, 8, 1}, ConvertNumberToReversedArrayOfDigits_000.digitize(1895478235));
//        assertArrayEquals(new int[] {3, 5, 3, 2, 8, 7, 4, 5, 9, 8, 1}, ConvertNumberToReversedArrayOfDigits_000.digitize(18954782353L));
    }
}