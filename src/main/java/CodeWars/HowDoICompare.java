package CodeWars;

public class HowDoICompare {
    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0] == x) {
                return (String) p[1];
            } else if (x.equals(1764)) {
                return "everything squared";
            }
        }
        return "nothing";
    }

    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };
}
