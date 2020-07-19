package CodeWars;

public class IsNDivisibleByXAndY {
    public static boolean isDivisible(long n, long x, long y) {
        // your code
        return (n % x == 0) && (n % y == 0);
    }
}
