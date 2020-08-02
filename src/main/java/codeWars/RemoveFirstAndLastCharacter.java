package codeWars;

public class RemoveFirstAndLastCharacter {
    public static String remove(String str) {
        // your code here
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < str.toCharArray().length - 1; i++) {
            result.append(str.toCharArray()[i]);
        }
        return result.toString();
    }
}
