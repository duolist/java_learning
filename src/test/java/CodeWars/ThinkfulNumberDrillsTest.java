package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarbleTest {

    final double epsilon = 0.0000001;

    @Test public void pulledTest1() {
        assertEquals(0.6, ThinkfulNumberDrills.guessBlue(5, 5, 2, 3), epsilon);
    }

//    @Test public void pulledTest2() {
//        assertEquals(0.2, ThinkfulNumberDrills.guessBlue(5, 7, 4, 3), epsilon);
//    }
}