package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class altERnaTIngcAsE {
    public static String toAlternativeString(String string) {
        // your code here!
        char[] stor = string.toCharArray();
        List<Character> result = new ArrayList<>();
        for (char ch : stor) {
            if (Character.isUpperCase(ch)) {
                result.add(Character.toLowerCase(ch));
            } else result.add(Character.toUpperCase(ch));
        }
        string = "";
        for (Character tmp:result) {
            string += tmp;
        }
        return string;
    }
}
