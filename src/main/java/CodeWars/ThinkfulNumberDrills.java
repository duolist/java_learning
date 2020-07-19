package CodeWars;

public class ThinkfulNumberDrills {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        // Place your code here
        double result = (double) (redStart - redPulled) / (blueStart - bluePulled);
        return Math.floor(result * 10) / 10;
    }
}
