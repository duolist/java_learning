package lambda_functionalInterfaces_0;

import java.util.ArrayList;
import java.util.List;

public class Switcher implements ElectricityConsumer {

    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener (ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener (ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn () {
        System.out.println("Выключатель включен");
        for (ElectricityConsumer consumer : listeners) {
            consumer.electricityOn();
        }

    }

    @Override
    public void electricityOn() {
        switchOn();
    }
}
