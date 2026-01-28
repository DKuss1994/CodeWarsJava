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
            for (char c : aChar) {
                if (numbersOfCharsA.containsKey(c)) {
                    numbersOfCharsA.replace(c, numbersOfCharsA.get(c) + 1);
                } else {
                    numbersOfCharsA.put(c, 1);

                }
            }
            for (char c : bChar) {
                if (numbersOfCharsB.containsKey(c)) {
                    numbersOfCharsB.replace(c, numbersOfCharsB.get(c) + 1);
                } else {
                    numbersOfCharsB.put(c, 1);

                }
            }
            if(numbersOfCharsA.equals(numbersOfCharsB)){
                return true;
            }

        } else {
            return false;
        }

        return false;
    }
}