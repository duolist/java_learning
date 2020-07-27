package CodeWars;

public class firstCharToApperCase_000 {
    public static void toApperCase (String someString) {
        StringBuilder builderOfStrings = new  StringBuilder();
        char[] tmpChars = someString.toCharArray();
        builderOfStrings.append(String.valueOf(tmpChars[0]).toUpperCase());
        for (int i = 1; i < tmpChars.length; i++) {
            builderOfStrings.append(tmpChars[i]);
        }
        someString = builderOfStrings.toString();
    }
}
