package lambda_functionalInterfaces_0;

public class App {
    static class Car {
        void test() {
            System.out.println("test");
        }
    }

    static class HeavyCar extends Car {
        @Override
        void test() {
            System.out.println("override test");
        }

        void test2() {

        }
    }

    public static void main(String[] args) {

    }
}
