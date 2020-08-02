package codeWars;

public class BeConcise_I_TheTernaryOperator {
    public static String describeAge(int age) {
//        if (age <= 12) {
//            return "You're a(n) kid";
//        } else if (age >= 13 && age <= 17) {
//            return "You're a(n) teenager";
//        } else if (age >= 18 && age <= 64) {
//            return "You're a(n) adult";
//        } else {
//            return "You're a(n) elderly";
//        }
        return "You're a(n) " + (age > 64 ? "elderly" : age > 17 ? "adult" : age > 12 ? "teenager" : "kid");
    }
}
