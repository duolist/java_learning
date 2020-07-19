package Collections;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static void listCounter () {
        List<Integer> testArray = new ArrayList<>();
        testArray.add(0);
        System.out.println(testArray.toString());

        for (int i = 0; i < 10; i++) {
            testArray.set(0, testArray.get(0) + 1);
            System.out.println(testArray.toString());
        }
    }
}
