package kyu7.SimpleFunReverseLetter;

public class Kata {
    public static String reverseLetter(final String str) {
        char[] charArray = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if(Character.isLetter(charArray[i])){
                stringBuilder.append(charArray[i]);
            }
        }
        return String.valueOf(stringBuilder); //coding and coding..
    }
}
