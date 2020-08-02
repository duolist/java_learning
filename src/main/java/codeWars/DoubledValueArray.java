package codeWars;

import java.util.Arrays;

public class DoubledValueArray {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(var -> var * 2)
                .toArray();
    }
}
