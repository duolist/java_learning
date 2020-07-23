package CodeWars;

import java.util.Arrays;

public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {
        //your code;
        int result = 0;
        if (arr.length > 1) {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 1; i++) {
                result += arr[i] - arr[i +1];
            }
            result *= -1;
        }
        return result;
    }
}
