package testAntExperiments;

public class BaseClass {

    private String id;
    private Integer age;
    public String name;

    public BaseClass(Integer age, String name) {
        this.id = "Base class";
        this.age = age;
        this.name = name;
    }
    public BaseClass () {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' + " ";
    }
}
