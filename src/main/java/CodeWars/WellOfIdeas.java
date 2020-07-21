package CodeWars;

public class WellOfIdeas {
    public static String well(String[] x) {
        String result = "Fail!";
        int good = 0;
        for (String value:x) {
            if (value.equals("good")) good++;
        }
        if (good != 0) result = "Publish!";
        if (good > 2) result = "I smell a series!";
        return result;
    }
}
