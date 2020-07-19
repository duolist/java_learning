package CodeWars;

import java.util.Arrays;
import java.util.OptionalDouble;

public class HowGoodAreYouReally_000 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
//        double a = Arrays.stream(classPoints).average().getAsDouble();
//        Arrays.stream(classPoints).average();
//        return Arrays.stream(classPoints).average().getAsDouble() < (double) yourPoints;   This is my realisation
        return Arrays.stream(classPoints).average().orElse(0) < (double) yourPoints;

        // Here question about Optional class and Optional Digital.

        // another question about stream of char array
    }
}
