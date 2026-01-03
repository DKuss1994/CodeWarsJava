package kyu6.MexicanWave;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class MexicanWave {

    public static String[] wave(String str) {
        int index = 0;
        int waveLength = 0;
        StringBuilder stringText = new StringBuilder();
        //Number of wave
        waveLength = numberOfChar(str, waveLength);
        String[] wave = new String[waveLength];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < waveLength; i++) {
                //Hier werden alle Sachen vor dem Großgeschrieben hinzugefügt
            addBeforeTheChar(index, stringText, charArray);
            //Hier wird der aktuelle Buchstabe Großgeschrieben
            index = CharUp(index, charArray, stringText);
            //Hier wird alles noch hinter dem Buchstaben hinzugefügt
            addBehindTheChar(index, charArray.length, stringText, charArray);
            wave[i] = String.valueOf(stringText);
            //Rest vom Stringbuilder für die neue Wave
            stringText = new StringBuilder();
        }


        return wave;
    }

    private static void addBeforeTheChar(int index, StringBuilder stringText, char[] charArray) {
        if (index != 0) {
            addBehindTheChar(0, index, stringText, charArray);
        }
    }

    private static void addBehindTheChar(int index, int charArray, StringBuilder stringText, char[] charArray1) {
        for (int i1 = index; i1 < charArray; i1++) {
            stringText.append(charArray1[i1]);
        }
    }

    private static int CharUp(int index, char[] charArray, StringBuilder stringText) {
        for (int i1 = index; i1 < charArray.length; i1++) {
            if (charArray[i1] == ' ') {
                stringText.append(' ');
            } else {
                index = i1;
                String s = String.valueOf(charArray[index]).toUpperCase(Locale.ROOT);
                stringText.append(s);
                index++;
                break;

            }
        }
        return index;
    }

    private static int numberOfChar(String str, int waveLength) {
        for (int i = 0; i < str.length(); i++) {
            char buchstabe = str.charAt(i);
            if (Character.isLetter(buchstabe)) {
                waveLength++;
            }
        }
        return waveLength;
    }

    public static String[] waveSubstring(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;

            list.add(str.substring(0, i) + Character.toUpperCase(ch) + str.substring(i + 1));
        }
        return list.toArray(new String[0]);

    }

    public static String[] waveStream(String str) {
        return IntStream.range(0, str.length()).mapToObj(n ->
                        str.substring(0, n) + Character.toUpperCase(str.charAt(n)) + str.substring(n + 1))
                .filter(a -> !a.equals(str)).toArray(String[]::new);
    }

}
