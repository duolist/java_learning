package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class GrasshopperSummation {
    public static int summation(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
