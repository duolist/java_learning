package codeWars;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();
        numberString.chars()
                .map(ch -> {
                    char tmpChar = '0';
                    if (ch > 52) {
                        tmpChar = '1';
                    }
                    return tmpChar;
                })
                .forEach(example -> result.append((char) example));
        return result.toString();

//        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");  SMART !!!
    }
}
