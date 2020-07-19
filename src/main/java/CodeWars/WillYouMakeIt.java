package CodeWars;

public class WillYouMakeIt {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!

        return fuelLeft * mpg >= distanceToPump;
    }
}
