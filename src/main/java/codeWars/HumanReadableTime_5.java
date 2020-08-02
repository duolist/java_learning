package codeWars;

public class HumanReadableTime_5 {
    public static String makeReadable(int seconds) {
        // Do something
        String result = "";
        StringBuilder strBuilder = new StringBuilder();
        int timeSec = 45248;
        Integer sec = 0; Integer min = 0; Integer hour = 0;
        min = seconds / 60;
        sec = seconds % 60;
        hour = min / 60;
        min = min % 60;
        if (hour < 10) {
            strBuilder.append(0).append(hour);
        } else strBuilder.append(hour);
        strBuilder.append(':');
        if (min < 10) {
            strBuilder.append(0).append(min);
        } else strBuilder.append(min);
        strBuilder.append(':');
        if (sec < 10) {
            strBuilder.append(0).append(sec);
        } else strBuilder.append(sec);
        result = strBuilder.toString();
        return result;
    }

}
