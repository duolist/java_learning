package testAntExperiments;

public class testVoidMethod {
    String name;
    Integer age;

    //Standard methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public testVoidMethod(String name, Integer age) {
        this.name = name;
        this.age = age;

    }
    // Extended methods

    public void addMisterToName () {
        this.setName("Mstr " + this.getName());
    }

}
