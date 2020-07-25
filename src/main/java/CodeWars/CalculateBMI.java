package CodeWars;

public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double value = weight / (height * height);
//        if (value > 30) {
//            return "Obese";
//        }
//        if (value > 25) {
//        return "Overweight";
//        }
//        if (value > 18.5) {
//            return "Normal";
//        }
//        if (value <= 18.5) {
//            return "Underweight";
//        }
        return value > 30 ? "Obese" : value > 25 ? "Overweight" : value > 18.5 ? "Normal" : value <= 18.5 ? "Underweight" : "";
        }
    }
