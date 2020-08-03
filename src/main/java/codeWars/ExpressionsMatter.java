package codeWars;

import java.util.Arrays;

public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c)
    {
        // Your Code here... Happy Coding!
        int first = a * (b + c);
        int first0 = a + (b + c);
        int second = a * b * c;
        int second0 = a + b + c;
        int third = a + b * c;
        int fourth = (a + b) * c;
        int[] result = Arrays.stream(new int[] {first, first0, second,second0, third, fourth}).sorted().toArray();

        return result[5];
    }
}
