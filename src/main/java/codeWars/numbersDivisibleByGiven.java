package codeWars;

import java.util.Arrays;

public class numbersDivisibleByGiven {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers)
                .filter(var -> var%divider==0)
                .toArray();
    }
}
