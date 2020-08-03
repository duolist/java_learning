package classesInnerAndFabric;

public class Main {
    public static void main(String[] args) {
        SomeClass firstSomeClass = new SomeClass();

        // Inicialisation of inner (internal) class by the method.
        SomeClass.InternalClass first = firstSomeClass.adder();
        SomeClass.InternalClass second = firstSomeClass.adder();

        //Inicialization of inner clas by constructor
        SomeClass.InternalClass another = firstSomeClass.new InternalClass();

        SomeClass secondSomeClass = new SomeClass();
        SomeClass.InternalClass third = secondSomeClass.adder();
        SomeClass.InternalClass fourth = secondSomeClass.adder();

        System.out.println(first.belongTo(secondSomeClass));
        System.out.println(first.getId());

        firstSomeClass.adder(2);
        System.out.println(firstSomeClass.toString());


        FabricClass testFabricClass = new FabricClass("first", 10).increaseValue(15).decreaseValue(10);

    }
}
