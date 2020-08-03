package codeWars;

import java.util.Arrays;

public class SquareSum {
    public static int squareSum(int[] n) {
        //Your Code
        return Arrays.stream(n)
                .map(operand -> operand*operand)
                .sum();
    }
}
