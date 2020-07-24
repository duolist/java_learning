package CodeWars;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        StringBuilder strBuilder = new StringBuilder();
//        result =
        Arrays.sort(s);

        for (int i = 0; i < s[0].toCharArray().length; i++) {
            strBuilder.append(s[0].toCharArray()[i]);
            if (i < s[0].toCharArray().length - 1)
            strBuilder.append("***");
        }

        return strBuilder.toString();

//        return String.join("***",s[0].split(""));    CLEVER !!!

//        return String.join("***", Arrays.stream(s).sorted().findFirst().orElse("").split(""));     CLEVER !!!
    }
}
