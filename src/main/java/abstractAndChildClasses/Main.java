package abstractAndChildClasses;

public class Main {
    public static void main(String[] args) {

        AbstractClass some = new ConcreteClass();

        System.out.println("-------------------------------------");
        some.abstractMethod();

    }
}

abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("1 AbstractClass () ");

        this.abstractMethod();
    }

    public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {

    String s = "FIRST";

    public ConcreteClass() {
        System.out.println("3 ConcreteClass ()");
        s = "SECOND";
    }

    @Override
    public void abstractMethod() {
        System.out.println("Realizacuya methoda abstractMethod() v Concreteclass " + s);

    }
}


