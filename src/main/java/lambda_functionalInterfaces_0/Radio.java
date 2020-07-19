package lambda_functionalInterfaces_0;

public class Radio implements ElectricityConsumer {
    public void playMusic() {
        System.out.println("Радио играет");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
