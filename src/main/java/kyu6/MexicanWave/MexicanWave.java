package kyu6.MexicanWave;

import java.util.Locale;

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

        System.out.println(waveLength);
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


}
