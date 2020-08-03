package codeWars;

import java.util.Arrays;

public class MergingSortedIntegerArrays____knowledge {
    public static int[] mergeArrays(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        System.arraycopy(first, 0, result, 0, first.length);
//      System.arrayCopy(from, fromIndex, to, toIndex, count);
        System.arraycopy(second, 0, result, first.length, second.length);
        Arrays.sort(result);
        result = Arrays.stream(result).distinct().toArray();
        return result;
//            return IntStream.concat(IntStream.of(first),IntStream.of(second)).distinct().sorted().toArray();   !!! SMART !!!
    }
}
