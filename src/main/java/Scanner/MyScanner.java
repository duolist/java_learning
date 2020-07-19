package Scanner;

import java.util.Scanner;

public class MyScanner {
    public void execute () {
        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(s);
        }


    }
}
