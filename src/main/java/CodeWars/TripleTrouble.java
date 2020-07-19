package CodeWars;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        // Solution
        String result = "";
        for (int i = 0; i < one.toCharArray().length; i++) {
            result += one.toCharArray()[i];
            result += two.toCharArray()[i];
            result += three.toCharArray()[i];
        }
        return result;
    }
}
