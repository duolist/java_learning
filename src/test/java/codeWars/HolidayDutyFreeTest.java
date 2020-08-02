package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolidayDutyFreeTest {

    @Test
    void dutyFree() {
        assertEquals(166, HolidayDutyFree.dutyFree(12,50,1000));
        assertEquals(294, HolidayDutyFree.dutyFree(17,10,500));
        assertEquals(357, HolidayDutyFree.dutyFree(24,35,3000));
        assertEquals(20, HolidayDutyFree.dutyFree(1400,35,10000));
        assertEquals(38, HolidayDutyFree.dutyFree(700,26,7000));
    }
}