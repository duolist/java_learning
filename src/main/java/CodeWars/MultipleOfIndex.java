package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        //your code;
        List<Integer> preResult = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                preResult.add(array[i]);
            }
        }
        return preResult.stream().mapToInt(i -> i).toArray();
    }
}
