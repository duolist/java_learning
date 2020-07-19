package CodeWars;

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits_000 {
    public static int[] digitize(long n) {
        // Code here
        n = Math.abs(n);
        int[] result = new int[String.valueOf(n).toCharArray().length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) n % 10;
            n /= 10;
        }
        return result;
    }
}
