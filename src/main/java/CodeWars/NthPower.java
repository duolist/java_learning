package CodeWars;

public class NthPower {
    public static int nthPower(int[] array, int n) {
//        int result = -1;
//        if (n < array.length)
//            result = (int)Math.pow(array[n], n);

        return n < array.length ? (int) Math.pow(array[n], n) : -1;
    }
}
