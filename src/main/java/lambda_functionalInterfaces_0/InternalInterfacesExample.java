package lambda_functionalInterfaces_0;

public class InternalInterfacesExample {
    public static void main(String[] args) {

        /*
          Класс A содержит интерфейс. Класс B имплементирует интерфейс класса A и имеет конкретную его реализацию
          Потом мы в конкретный эксземпляр итрефейса класса А помещаем новый экземпляр класса B
          с конкретной реализацией интерфейса
         */

        A.NestedIf nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("Число 10 не отрицательное.");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("Этo не будет выведено.");
        }

        A myA = new A();


    }
}
