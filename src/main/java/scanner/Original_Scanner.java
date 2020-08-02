package scanner;
import java.util.Scanner;

public class Original_Scanner {
    public void execute () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i);
        } else {
            System.out.println("Вы ввели не целое число");
        }
        scanner.close();
    }

}
