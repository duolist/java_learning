package CodeWars;

import org.junit.Test;

import static org.junit.Assert.*;

public class YouOnlyNeedOneBeginnerTest {

    @Test
    public void check() {
        assertEquals(YouOnlyNeedOneBeginner.check(new Object[] {66, 101}, 66), true);
        assertEquals(YouOnlyNeedOneBeginner.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(YouOnlyNeedOneBeginner.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(YouOnlyNeedOneBeginner.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
    }
}