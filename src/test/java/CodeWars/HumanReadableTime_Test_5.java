package CodeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanReadableTime_Test_5 {
    @Test
    public void Tests() {
        assertEquals("makeReadable(0)", "00:00:00", HumanReadableTime_5.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", HumanReadableTime_5.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", HumanReadableTime_5.makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTime_5.makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", HumanReadableTime_5.makeReadable(359999));
    }
}