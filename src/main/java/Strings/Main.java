package Strings;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // String builder
        String exp = "";
        String[] strings = {"Dima" , "Vasya", "Valeron", "Alex"};
        System.out.println(MyStringBuilder.builder(strings));
        for (String str:
             strings)
            exp += str + " ";
        System.out.println(exp);
        System.out.println(exp.equals(MyStringBuilder.builder(strings)));


        Integer a = 8;
        String str = "Таким образом мы можем расчленить выражение на отдельные эелементы";
        List<String> myStringList = Arrays.asList(str.split(" "));

        myStringList.forEach(System.out::println);







//        String Str = new String("Добро-пожаловать-на-ProgLang.su");
//
//        System.out.println("Возвращаемое значение limit 2: ");
//        for (String retval : Str.split("-", 2)) {
//            System.out.println(retval);
//        }
//        System.out.println();
//        System.out.println("Возвращаемое значение limit 3: ");
//        for (String retval : Str.split("-", 3)) {
//            System.out.println(retval);
//        }
//        System.out.println();
//        System.out.println("Возвращаемое значение limit 0: ");
//        for (String retval : Str.split("-", 0)) {
//            System.out.println(retval);
//        }
//        System.out.println();
//        System.out.println("Возвращаемое значение: ");
//        for (String retval : Str.split("-")) {
//            System.out.println(retval);
//        }

    }
}
