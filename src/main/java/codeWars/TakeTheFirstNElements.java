package codeWars;

import java.util.Arrays;

public class TakeTheFirstNElements {
    public static int[] take(int[] arr, int n) {
        int[] result = new int[0];
        if (n > arr.length) {
            n = arr.length;
        }
        if (arr.length > 0) {
            result = Arrays.copyOfRange(arr, 0, n);
        }
        return result;
    }
}
