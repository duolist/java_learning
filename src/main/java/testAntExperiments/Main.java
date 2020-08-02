package testAntExperiments;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        testVoidMethod me = new testVoidMethod("Dima", 34);
//        me.addMisterToName();
//        System.out.println(me.getName());
//
//        testVoidMethod another = testVoidMethod.creator();
        DerivedClass derivedClass = new DerivedClass(7, "Name", "Annotation");
        BaseClass baseClass = (BaseClass) derivedClass;

        System.out.println(baseClass.toString());
        System.out.println(baseClass instanceof BaseClass);
        System.out.println(baseClass instanceof DerivedClass);
        System.out.println();




    }
}
