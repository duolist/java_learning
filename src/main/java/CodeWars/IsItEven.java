package CodeWars;

import java.math.BigDecimal;

public class IsItEven {
    public static boolean isEven(double n) {
        // Your awesome code here!
        boolean result = false;
        if (n % 1 == 0.0) {
            int a = (int) n;
            if (a % 2 == 0) {
                result = true;
            }
        }
        return result;
    }

//    public static boolean isInteger(String str) {
//        try {
//            Integer.parseInt(str);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
//    }
}
