package codeWars;

public class ILoveYouALittleALot {
    public static String howMuchILoveYou(int nb_petals) {
            nb_petals %= 6;
            switch (nb_petals) {
                case (1):
                    return "I love you";
                case (2):
                    return "a little";
                case (3):
                    return "a lot";
                case (4):
                    return "passionately";
                case (5):
                    return "madly";
                case (0):
                    return "not at all";
            }

        return "";
    }
}
