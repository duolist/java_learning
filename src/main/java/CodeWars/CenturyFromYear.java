package CodeWars;

public class CenturyFromYear {
    public static int century(int number) {
        // your code goes here
        String numberStr = String.valueOf(number);
        String tale = "";
        int result;
        if (number > 9) {
            tale = numberStr.substring(numberStr.length() - 2);
        }
        result = number / 100 + 1;
        if (tale.equals("00")) {
            result -= 1;
        }

        return result;
    }
}
