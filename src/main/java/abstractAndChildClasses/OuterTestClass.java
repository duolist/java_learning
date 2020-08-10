package abstractAndChildClasses;

public class OuterTestClass {
    private String outerPrivateString;
    protected String outerProtectedString;


    private class InnerTestClass {
        public String innerString;
    }

    public OuterTestClass (String outerPrivateString, String outerProtectedString) {
        this.outerPrivateString = outerPrivateString;
        this.outerProtectedString = outerProtectedString;

    }
}
