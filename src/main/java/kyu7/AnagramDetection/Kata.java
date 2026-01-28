package kyu7.AnagramDetection;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static boolean isAnagram(String a, String b) {
        Map<Character, Integer> numbersOfCharsA = new HashMap<>();
        Map<Character, Integer> numbersOfCharsB = new HashMap<>();
        if (a.length() == b.length()) {
            char[] aChar = a.toLowerCase().toCharArray();
            char[] bChar = b.toLowerCase().toCharArray();
            extracted(aChar, numbersOfCharsA);
            extracted(bChar, numbersOfCharsB);
            if(numbersOfCharsA.equals(numbersOfCharsB)){
                return true;
            }

        } else {
            return false;
        }

        return false;
    }

    private static void extracted(char[] bChar, Map<Character, Integer> numbersOfCharsB) {
        for (char c : bChar) {
            if (numbersOfCharsB.containsKey(c)) {
                numbersOfCharsB.replace(c, numbersOfCharsB.get(c) + 1);
            } else {
                numbersOfCharsB.put(c, 1);

            }
        }
    }

    public static boolean isAnagramSort(String s, String s1) {

        return false;
    }
}