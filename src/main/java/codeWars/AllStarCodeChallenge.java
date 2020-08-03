package codeWars;

public class AllStarCodeChallenge {
    public static int strCount(String str, char letter) {
        //write code here
        int a = 0;
        for (char t:str.toCharArray()) {
            if (letter==t) {
                a++;
            }
        }
        return a;
    }
}
