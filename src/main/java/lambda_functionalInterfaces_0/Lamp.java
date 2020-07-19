package lambda_functionalInterfaces_0;

public class Lamp implements ElectricityConsumer {

    private String text = new String();

    public void lightOn () {
        System.out.println(text + " зажглась");
    }

    public void electricityOn() {
        lightOn();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Lamp(String text) {
        this.text = text;
    }
}
