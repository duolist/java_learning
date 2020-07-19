package CodeWars;

import java.util.Arrays;
import java.util.function.Predicate;

public class YouOnlyNeedOneBeginner {


    public static boolean check(Object[] a, Object x) {
        // Your code here
//        boolean result = false;
//        for (Object var: a) {
//            if (var.equals(x)) result = true;
//        }
//        return result;
        return Arrays.stream(a).anyMatch(s -> s.equals(x));
    }
}
