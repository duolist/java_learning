package CodeWars;

import java.util.Arrays;
import java.util.function.Function;

public class TotalAmountOfPoints {
    public static int points(String[] games) {


        int finalCount = 0;
        for (String value : games) {
//            char a = value.charAt(0);
//            char b = value.charAt(2);

            int x = Integer.parseInt(Character.toString(value.charAt(0)));
            int y = Integer.parseInt(Character.toString(value.charAt(2)));
            finalCount += x > y ? 3 : x == y ? 1 : 0;

        }

        return finalCount;
// Stupid power
//            int finalCount = 0;
//            Function<String, Integer> worker = s -> {
//                char a = s.charAt(0);
//                char b = s.charAt(2);
//                int result = -1;
//                int x = Integer.parseInt(Character.toString(a));
//                int y = Integer.parseInt(Character.toString(b));
//                if (x > y) {
//                    result = 3;
//                } else if (x < y) {
//                    result = 0;
//                } else if (x == y) {
//                    result = 1;
//                }
//                return result;
//            };
//            for (String value : games) finalCount += worker.apply(value);
//            return finalCount;

//    return 0;

    }
}
