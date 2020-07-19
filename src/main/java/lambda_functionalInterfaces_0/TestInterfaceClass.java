package lambda_functionalInterfaces_0;

public class TestInterfaceClass implements TestInterface {

    @Override
    public int returnerMethod(int i, int y) {
        return i + 10 + y;
    }
}
