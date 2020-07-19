package Collections;

import java.util.List;

public class Print {
    public static void print (List<Integer> incoming) {

       if (incoming.get(1).equals(0)) {
           System.out.println("Эелемент не удалось найти");
       } else {
           System.out.print("Искомый элемент " + incoming.get(0) + " Встречается " + incoming.get(1) + " раз(а), по индексам: ");
           for (int i = 2; i < incoming.size(); i++) {
               System.out.print(incoming.get(i));
               if (i < incoming.size()-1) System.out.print(", "); //Ставит запятую после эелемента, исключая последний
           }
       }
    }
}
