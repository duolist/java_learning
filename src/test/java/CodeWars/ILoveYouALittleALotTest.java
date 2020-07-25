package CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ILoveYouALittleALotTest {

    @Test
    void howMuchILoveYou() {
        assertEquals("I love you", ILoveYouALittleALot.howMuchILoveYou(133));
        assertEquals("a little", ILoveYouALittleALot.howMuchILoveYou(2));
        assertEquals("not at all", ILoveYouALittleALot.howMuchILoveYou(6));
        assertEquals("passionately", ILoveYouALittleALot.howMuchILoveYou(4));
    }
}