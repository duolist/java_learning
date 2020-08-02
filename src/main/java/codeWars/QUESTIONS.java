package codeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QUESTIONS {
    public static void main(String[] args) {


        List<Integer> integers = Arrays.asList(1, 2, 3);
//        List<int> ints = new ArrayList<>();
        //List не принимает примитивы!!! только ссылочные типы(Person, Car ...) или обертки (Integer, String ...)
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] ints = Arrays.stream(arr).filter(i -> i > 2).toArray();
        //ты может InsStream завернуть в массив!!! но не в лист!!!

        List<Integer> collect = Arrays.stream(arr)
                .boxed()//данный метод заварачивает примитив в обертку
                .collect(Collectors.toList());//я пользуюсь таким вариантом, считаю он правильный

        List<Integer> collect1 = Arrays.stream(arr)
                //потому что преобразования не происходит, так как используется метод map
                //этот метод не вызывается потому, что map зависит от типа данных в стриме,
                //если у тебя стрим int, то map (после каких то преобразований должен вернуть int)
                //тебе пребуется операция преобразования в другой тип, для этого исп метод mapTo...
                //есть встроенные toInt, toLong, ToDouble, если требуется другой тип, то реализуешь через метод mapToObg
                //каждый элемент типа int стал элементом типа String
                .boxed()
                .collect(Collectors.toList());
        //Вопросы? Пока нет. спс. буду тренькаться


//                .mapToObj(Integer::valueOf)//данным методом заворачиваем примитивы в обертку,
                //метод valueOf возвращает Integer (не int)
                //метод parseInt возвращает int (не Integer)
                //idea говорит что это действие равноценно методу boxed

        //Вопросы? Почему не работает map (Integer::pareint)
        //метод parseInt принимает String, а у тебя стрим int`ов, по этому и не работает)

        //        !!!!!!   С П Р О С И Т Ь #1   !!!!!!

        int[] myInt = {0,2,3,4,5,6,7,8,9};
        List<Integer> myList = Arrays.stream(myInt)
                .filter(v -> v > 5)
                .boxed()
                .collect(Collectors.toList());







        /* ++++++++++++++++++++++++++++++++++++++++++++++++


        int[] a = {1,2,3,4,5,6,7};
        Integer[] integers = Arrays.stream(a).boxed().toArray(Integer[]::new);
// Результат верхний строки это массив, который передается в конструктор массива
// Верхняя запись эквивалентна

       integers = Arrays.stream(a).boxed().toArray(v -> new Integer[v]);

         */


    }
}

