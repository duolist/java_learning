package codeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        List<Character> collector = Arrays.asList(name.split(" ")).stream()
                .map(string ->
                        string.charAt(0)
                ).collect(Collectors.toList());

        return collector.get(0).toString().toUpperCase() + "." + collector.get(1).toString().toUpperCase();
    }
}
