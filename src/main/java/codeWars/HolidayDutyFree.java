package codeWars;

public class HolidayDutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        Double preResult = (double)hol / (((double)normPrice / 100 ) * (double)discount) ;
        int result = preResult.intValue();
        return (int)result;

    }
}
