package kyu6.MexicanWave;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class MexicanWave {

    public static String[] wave(String str) {
        //hello
        // h e l l o
        int index = 0;

        int waveLength = 0;
        StringBuilder stringText = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char buchstabe = str.charAt(i);
            if(Character.isLetter(buchstabe)){
                waveLength++;
            }
        }
        String[] wave = new String[waveLength];
        char[] charArray = str.toCharArray();
        //Wieviele Waves erstellt werden müssen
        for (int i = 0; i < waveLength; i++) {
            //Hier werden alle Sachen vor dem großschreiben hinzugefügt
            if (index != 0) {
                for (int i2 = 0; i2 < index; i2++) {
                    stringText.append(charArray[i2]);
                }
            }
            for (int i1 = index; i1 < charArray.length; i1++) {
                if (charArray[i1] == ' ') {
                    stringText.append(' ');
                }
                else {
                    index = i1;
                    String s = String.valueOf(charArray[index]).toUpperCase(Locale.ROOT);
                    stringText.append(s);
                    index++;
                    break;

                }
            }
            for (int i1 = index; i1 < charArray.length; i1++) {
                stringText.append(charArray[i1]);
            }


            wave[i] = String.valueOf(stringText);
            stringText = new StringBuilder();

        }


        return wave;
    }
    public static String[] waveSubstring(String str){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ')continue;

            list.add(str.substring(0,i)+Character.toUpperCase(ch)+str.substring(i+1) );
        }
        return list.toArray(new String[0]);

    }
    public static String[] waveStream(String str){
        return IntStream.range(0,str.length()).mapToObj(n->
                str.substring(0,n)+Character.toUpperCase(str.charAt(n))+str.substring(n+1))
                .filter(a->!a.equals(str)).toArray(String[]::new);
    }

}
