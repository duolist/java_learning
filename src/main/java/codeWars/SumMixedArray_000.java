package codeWars;

import java.util.List;

public class SumMixedArray_000 {
    public int sum(List<?> mixed) {
        int result = 0;

//        List<?> tmp = Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0");
//        List<Integer> myIntegers = tmp.stream()
//                .filter(value -> value instanceof String)
//                .map(x -> Integer.valueOf((String) x))
//                .collect(Collectors.toList());

        result = mixed.stream()
                .filter(value -> value instanceof String)
                .map(x -> Integer.valueOf((String) x))
                .mapToInt(Integer::valueOf).sum();
        result += mixed.stream()
                .filter(value -> value instanceof Integer)
                .map(x -> (Integer) x)
                .mapToInt(Integer::valueOf).sum();
        return result;

//        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum(); CLEVER !!!!
    }
}
