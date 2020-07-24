package CodeWars;



import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        System.out.println(FakeBinary.fakeBin("0123456789"));
//        System.out.println();
        //Commit on Ubuntu desktop
        String str0 = "Aima";
        String str1 = "Bima";
        System.out.println(str0.compareTo(str1));
        int[] intarr = {0,1,2,3,4,5,6,7,8,15,10};
        Integer[] integerArr = Arrays.stream(intarr).boxed().toArray(Integer[]::new);
        List<Integer> myIntlist = new ArrayList<>(Arrays.asList(2, 5));
        Collections.addAll(myIntlist, integerArr);
        System.out.println(myIntlist.toString());




//        Integer [] myIntegerArray = {-1, -5, 6, -17, 17, 28, -28};
//        List<Integer> testList = Arrays.stream(myIntegerArray)
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(testList.toString());








    }
}

//Second test coomit to beta