package kyu6.CountCharactersInYourString;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character,Integer> countCharacter= new HashMap<>();
        int count;
        if(str.isEmpty()){
            return countCharacter;
        }
        char [] strToChar = str.toCharArray();
        for (char c : strToChar) {
            count = 1;
            if(countCharacter.containsKey(c)){
                count++;
                countCharacter.replace(c,count);
            }
            countCharacter.put(c,count);
        }
        return countCharacter;
    }
}
