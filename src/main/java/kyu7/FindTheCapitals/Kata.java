package kyu7.FindTheCapitals;

import java.util.ArrayList;

public class Kata{
    public static int[] capitals(String s){
        char[] charArray = s.toCharArray();
        ArrayList<Integer> valueList= new ArrayList<>();
        for (int i = 0; i<s.length();i++) {
            if(Character.isUpperCase(charArray[i])){
                valueList.add(i);
            }
        }
        int [] value = new int[valueList.size()];
        for (int i = 0; i < valueList.size(); i++) {
            value[i] = valueList.get(i);
        }
        return value;

    }
}