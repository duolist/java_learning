package CodeWars;

import java.beans.Expression;
import java.util.*;

public class FindTheOddInt_6___knowledge {


    public static int findIt(int[] a) {

        Integer[] integers = Arrays.stream(a).boxed().toArray(Integer[]::new);
        //var -> new  Integer[var]

        Map<Integer, Integer> myMap = new HashMap<>();
        for (int var1 : a) {
            myMap.put(var1, frequency(var1, a));
        }

        //ты получил один элемент (мог получить несколько), mapToInt преобразует КАЖДЫЙ элемент в Integer!
        //Решение такое:

//        return myMap.entrySet().stream()
//                .filter(entry -> entry.getValue() % 2 != 0) //по случаю здест только один элемент
//                .mapToInt(Map.Entry::getKey)                //ссылка на метод берет значение ключа (каждого) и все (так как ключ уже Integer), фактически  Я моsгtу rтебе позвонить?yes
//                .findFirst()
//                .orElseThrow(ArithmeticException::new);


        //короче логическая ошибка, смотри, первое число с частотой & 2 != 0 это 12!!! тест говорит что должно быть 12, а получилось 1, мэпа выполняет сортировку, что не верно


    return myMap.entrySet().stream().filter(entryset -> entryset.getValue() % 2 != 0).mapToInt(entryset -> entryset.getKey()).sum(); // Ну так мое решение прошло проверку ?!
   // Вопрос в чем - я получил MapToUnteger, там один инт, как его из стрима перевести в число. Мне пришлось вызывать у стрима сумму. Чтобы сумма одного числа стала интом(лайвхак =) )
    }
    // Ниже отдельный метод создал для подсчета частоты числа в массиве

    public static Integer frequency(Integer value, int[] myArr) {
        Integer count = 0;
        for (int var : myArr) {
            if (value.equals(var)) count++;
        }
        return count;
    }

}
