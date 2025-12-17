package kyu8.Palindrome;

import java.util.Locale;

public class Palindrome {
    public static Boolean isPalindrome(String x) {
        String text = x.toLowerCase(Locale.ROOT);
        StringBuilder stringBuilder = new StringBuilder(text);
        String textChange = stringBuilder.reverse().toString();
        return text.equals(textChange);

    }
}