package CodeWars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayElementParity {
    public static int solve(int [] arr){
        //..

        return Arrays.stream(arr).distinct().sum();
    }
}
