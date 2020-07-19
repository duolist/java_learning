package Strings;

public class MyStringBuilder {
    public static String builder(String[] str) {
        //        String[] strings = {"Dima" , "Vasya", "Valeron", "Alex"};
        String result = new String();
        StringBuilder builder = new StringBuilder();

        for (String string : str) {
            builder.append(string + " ");
        }
        result = builder.toString();
        return result;
    }
}
