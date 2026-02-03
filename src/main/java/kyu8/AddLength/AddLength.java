package kyu8.AddLength;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddLength{

    public static String[] addLength(String str){
        String[] x = getStrings(str);
        if (x != null) return x;
        return getStrings1(str);
    }

    private static String[] getStrings1(String str) {
        String []strList = str.split(" ");
        for (int i = 0; i < strList.length; i++) {
            strList[i] += " "+strList[i].length();
        }
        return strList;
    }

    private static String[] getStrings(String str) {
        if(str.isEmpty()){
            return new String[]{"0"};
        }
        return null;
    }

    public static String[] addLengthStream(String ban) {
        if(ban.isEmpty()){
            return new String[]{"0"};
        }
        return Arrays.stream(ban.split(" ")).map(w ->w +" "+w.length()).toArray(String[]::new);

    }
}