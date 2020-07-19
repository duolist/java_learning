package Collections;

import java.util.ArrayList;
import java.util.List;

public class linearSearchCount {

    public static List<Integer> linearSearch(List<Integer> incoming, Integer element) {
        List<Integer> counter = new ArrayList<>();
        counter.add(element); counter.add(0); //Первый элемент - искомое, дальше сколько раз найден, дальше - индексы
        for (int index = 0; index < incoming.size(); index++) {
            if (incoming.get(index).equals(element)) {
                counter.set(1, counter.get(1) + 1);
                counter.add(index);
            }

        } return counter;

    }
}



