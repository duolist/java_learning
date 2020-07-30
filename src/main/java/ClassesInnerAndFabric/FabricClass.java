package ClassesInnerAndFabric;

public class FabricClass {
    String name;
    Integer value;

    public FabricClass(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public FabricClass increaseValue (Integer var) {
        this.value += var;
        return this;
    }

    public FabricClass decreaseValue (Integer var) {
        this.value -= var;
        return this;
    }
}
