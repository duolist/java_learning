package lambda_functionalInterfaces_0;

import java.util.Comparator;
import java.util.function.Function;

public class Main {
    public static void staticTest() {
        System.out.println("Static method");
    }

    public static void test2(int a) {
        System.out.println("Test2");
    }

    public static int lambdaArithmetic (Integer a, Integer b, TestInterface i) {return i.returnerMethod(a, b); }
    public static void lambdaTest (int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
//        Main myMane = new Main();
//        Switcher sw = new Switcher();
//        Lamp lamp0 = new Lamp("Лампа 0");
//        Radio radio0 = new Radio();
//
//        sw.addElectricityListener(lamp0);
//        sw.addElectricityListener(radio0);
//
//        sw.addElectricityListener(
//
//                () -> System.out.println("Лямбда")
//        );
//
//
//        sw.addElectricityListener(
//
//                Main::staticTest
//        );
//

        System.out.println(Main.lambdaArithmetic(
                4, 4,
                (i, y) -> i + 5 + y)
        );
//        Main.lambdaTest(new TestInterfaceClass().returnerMethod(4,5));

        TestInterface justSumm = Integer::sum;
        TestInterface justPow = (i, y) -> i * y;
        System.out.println(justSumm.returnerMethod(2,3));
        System.out.println(justPow.returnerMethod(2,3));

        System.out.println("////////////////");

//
//        sw.switchOn();

    }

}
