package CodeWars;

public class ItsTooHotAndTheyCantEven {
    public static boolean divide(int weight) {
        // your code here

//        boolean result = false;
//        if (weight % 2 == 0) {
//            result = weight != 2;
//        }
        return weight > 3 && weight % 2 == 0;
    }
}
