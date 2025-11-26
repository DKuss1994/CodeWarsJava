package kyu7.TwoToOne;

import java.util.*;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        String longest = s1 + s2;
        longest.toLowerCase(Locale.ROOT);
        char[] chars = longest.toCharArray();
        Arrays.sort(chars);
        StringBuilder newChars = new StringBuilder();
        for(int i = 0; i<chars.length;i++){
            if(i==0||chars[i]!=chars[i-1]){
                newChars.append(chars[i]);

            }
        }


        String newlongest = new String  (newChars);
        return newlongest;

    }
}