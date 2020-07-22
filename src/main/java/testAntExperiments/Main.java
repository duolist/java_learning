package testAntExperiments;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        testVoidMethod me = new testVoidMethod("Dima", 34);
        me.addMisterToName();
        System.out.println(me.getName());

    }
}
