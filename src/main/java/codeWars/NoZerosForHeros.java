package codeWars;

public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        // your code
        if (n != 0) {
            while (n % 10 == 0) {
                n = n / 10;
            }
        }
        return n;

    }
}
