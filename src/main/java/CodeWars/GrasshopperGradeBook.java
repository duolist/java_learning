package CodeWars;

public class GrasshopperGradeBook {
    public static char getGrade(int s1, int s2, int s3) {
        char result = '0';
        int mean = (int) (s1 + s2 + s3) / 3;
        if (mean < 60) {
            result = 'F';
        }else if (mean < 70) {
            result = 'D';
        }else if (mean < 80) {
        result = 'C';
        }else if (mean < 90) {
            result = 'B';
        }else if (mean < 101) {
            result = 'A';
        }


        return result;
    }
}
