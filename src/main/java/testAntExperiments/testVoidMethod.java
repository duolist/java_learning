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
    
    //          Static fabric methods

    public static testVoidMethod creator () {
        return new testVoidMethod();
    }

    public static testVoidMethod putname (testVoidMethod tmp, String name) {
        return tmp;
    }
    
    
    //          CONSTRUCTORS 

    public testVoidMethod(String name, Integer age) {
        this.name = name;
        this.age = age;

    }
    public testVoidMethod () {
        
    }
    // Extended methods

    public void addMisterToName () {
        this.setName("Mstr " + this.getName());
    }

}
