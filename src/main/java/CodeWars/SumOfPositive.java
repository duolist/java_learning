package CodeWars;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class SumOfPositive {
    public static int sum(int[] arr) {

        return Arrays.stream(arr).filter(a -> a > 0).sum();
    }
}
