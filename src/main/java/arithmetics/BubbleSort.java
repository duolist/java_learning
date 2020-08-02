package arithmetics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void sorter () {
        List<Integer> someList = new ArrayList<>(Arrays.asList(0, 5, 16, 145, 78, -14, -12, 15, 15, 28, 37, 38));
        System.out.println("Array before \n" + someList.toString());
        for (int i = someList.size(); i > -1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (someList.get(j) > someList.get(j + 1)) {
                    Integer tmp = someList.get(j + 1);
                    someList.set(j + 1, someList.get(j));
                    someList.set(j, tmp);
                }
            }
        }

        System.out.println("Array after \n" +someList.toString());
    }

}
