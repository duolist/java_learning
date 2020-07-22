package lambda_functionalInterfaces_0;

public class InternalInterfacesExample {
    public static void main(String[] args) {
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
