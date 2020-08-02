package scanner;


import java.util.Scanner;

public class Scanner_loop {
    public void loop() {
        Scanner myScanner;

        int i = 0;
        do {
            myScanner = new Scanner(System.in);
            System.out.println("Введите число");
            if (myScanner.hasNextInt()) {
                i = myScanner.nextInt();
                System.out.println("Заебца! Вы ввели число " + i);
                if (i >= 0) {
                    System.out.print("Число положительное");
                } else {
                    System.out.print("Число отрицательное");
                }
                break;
            } else {
                System.out.println("Вы ввели не число");

            }

        } while (!myScanner.hasNextInt());


    }
}
