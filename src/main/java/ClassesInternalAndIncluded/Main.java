package ClassesInternalAndIncluded;

public class Main {
    public static void main(String[] args) {
        InternalClass firstInternalClass = new InternalClass();
        InternalClass.Internal first = firstInternalClass.adder();
        InternalClass.Internal second = firstInternalClass.adder();

        InternalClass secondInternalClass = new InternalClass();
        InternalClass.Internal third = secondInternalClass.adder();
        InternalClass.Internal fourth = secondInternalClass.adder();

        System.out.println(first.belongTo(secondInternalClass));
        System.out.println(first.getId());

        firstInternalClass.adder(2);
        System.out.println(firstInternalClass.toString());
    }
}
