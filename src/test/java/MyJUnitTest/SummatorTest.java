package MyJUnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummatorTest {

    @Test
    void simpleSumm() {
        Summator testSummator = new Summator();
        int actual = testSummator.simpleSumm(5,5);
        int expected = 10;
        assertEquals(expected, actual);
    }
}