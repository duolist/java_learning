package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {
    static boolean testOfDeleter(Integer a, Deleter d) {
        return d.deleteIF(a);
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        array.add(0);
        array.add(24);
        array.add(-146);
        array.add(878);
        array.add(-146);
        array.add(-146);
        array.add(-2);
        array.add(0);
        array.add(13);
        {
//        System.out.println(array.toString());
//
//        List<Integer> test = new ArrayList<>();
//        test.add(-146); test.add(3); test.add(2); test.add(4); test.add(5);
//        Print.print(test);
        }
        ////////////////////////////////////////////////


//          Test of method which find element in collection and it frequency
//        Print.print(linearSearchCount.linearSearch(array, -146));


//        array.removeIf(integer -> integer < 0);
        System.out.println();
        System.out.println(array);
        Function<String, Integer> ttt = s -> s.length();
        System.out.println(ttt.apply("hellow"));
        MyList testMyList = new MyList(array);
        testMyList.printMyList();
        System.out.println("!!!!");
        testMyList.deleteFromMyList(i -> i < 0);
        testMyList.printMyList();
        System.out.println();

        {

            System.out.println(Main.testOfDeleter(5, i -> i < 0));
        }




//          Adding one collection to another
//        int[] intarr = {0,1,2,3,4,5,6,7,8,15,10};
//        Integer[] integerArr = Arrays.stream(intarr).boxed().toArray(Integer[]::new);
//        List<Integer> myIntlist = new ArrayList<>(Arrays.asList(2, 5));
//        Collections.addAll(myIntlist, integerArr);
//        System.out.println(myIntlist.toString());


    }
}
