package testAntExperiments;

public class DerivedClass extends BaseClass {

    private String annotation;

    public DerivedClass( Integer age, String name, String annotation) {
        super(age, name);
        this.setId("Derived class");
        this.annotation = annotation;
    }
    public DerivedClass () {

    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public String toString() {
        return super.toString() +
                "annotation='" + annotation + '\'';
    }
}
