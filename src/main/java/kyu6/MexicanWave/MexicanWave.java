package kyu6.MexicanWave;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;
/*# Mexican Wave (6 kyu)

# https://www.codewars.com/kata/58f5c63f1e26ecda7e000029
# Sprache: Java
# Datum: 02.01.2026

# Aufgabe:
# Erstelle eine Funktion, die aus einem String eine La Ola Welle erzeugt.
# Jeder Großbuchstabe stellt eine aufstehende Person dar.
# Pro Durchlauf darf genau ein Buchstabe großgeschrieben werden.
#
# Regeln:
# Der String enthält nur Kleinbuchstaben und Leerzeichen
# Leerzeichen werden übersprungen und erzeugen keine Welle
# Ist der String leer, wird ein leeres Array zurückgegeben
#
# Beispiel:
# "hello"
# Ergebnis:
# ["Hello", "hEllo", "heLlo", "helLo", "hellO"]
#
# " s p a c e s "
# Ergebnis:
# [" S p a c e s ", " s P a c e s ", " s p A c e s ", " s p a C e s ", " s p a c E s ", " s p a c e S "]
#
# Lösungsansätze:
# 1. Klassische Lösung mit Char Array und StringBuilder
# 2. Lösung mit substring für bessere Lesbarkeit
# 3. Lösung mit Streams für funktionalen Ansatz
#
# Ich habe gelernt:
# wie man Zeichen gezielt überspringt
# wie substring effizient eingesetzt wird
# wie Streams lesbaren Code erzeugen können
# wie man mehrere Lösungswege sauber testet
*/

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
