package codesignal;

import java.lang.reflect.Array;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(new CheckPalindrome().checkPalindrome("sds"));

    }

    boolean checkPalindrome(String inputString) {
        String reverse = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse = reverse + inputString.charAt(i);
        }
        return (reverse.equals(inputString)) ? true : false;
    }

}
