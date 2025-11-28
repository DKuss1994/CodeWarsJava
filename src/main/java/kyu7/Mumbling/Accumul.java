package kyu7.Mumbling;

import java.util.Locale;
/*# Mumbling (7 kyu)

# https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java
        # Sprache: Java
# Datum: 2025-11-28

        # Aufgabe:
        # Schreibe eine Funktion accum, die aus einem gegebenen String ein bestimmtes Muster erzeugt.
        # Für jeden Buchstaben im String soll:
        # - der erste Buchstabe groß geschrieben werden
        # - danach wird derselbe Buchstabe (in Kleinbuchstaben) so oft wiederholt,
        #   wie sein Index im String ist
        # - alle Teile werden mit einem Doppelpunkt getrennt

        # Beispiele:
        # accum("abcd") -> "A Bb Ccc Dddd"
        # accum("RqaEzty") -> "R Qq Aaa Eeee Zzzzz Tttttt Yyyyyyy"
        # accum("cwAt") -> "C Ww Aaa Tttt"

# Ich habe gelernt, wie man mit verschachtelten Schleifen arbeitet,
# wie man aus jedem Zeichen ein bestimmtes Muster erzeugt
# und wie man Strings mit StringBuilder effizient zusammensetzt.
# Außerdem habe ich verstanden, wie man gezielt Groß- und Kleinschreibung steuert
# und wie man Elemente sauber mit einem Trennzeichen verbindet.
*/

public class Accumul {
    public static String accum(String s) {
        int counter = 1;
        //Wie oft wird der erste buchstabe wiederholt immer um eins mehr.
        int wieOft;
        StringBuilder text = new StringBuilder();
        s = s.toLowerCase(Locale.ROOT);
        for (int i = 0; i < s.length(); i++) {
            wieOft = i + 1;
            for (int y = 0; y < wieOft; y++) {
                if (y == 0) {
                    String x = String.valueOf(s.charAt(i));
                    text.append(x.toUpperCase());


                } else {
                    text.append(s.charAt(i));
                }
            }
            if (counter < s.length()) {
                text.append("-");
                counter++;
            }
        }
        return String.valueOf(text);
    }
}
