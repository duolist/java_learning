package codeWars;

public class ReversedStrings {
    public static String reversedStr(String str) {
        // Your code here...
//        StringBuffer strBuf = new StringBuffer(str);
//        strBuf.reverse();
        return new StringBuffer(str).reverse().toString();
    }
}
