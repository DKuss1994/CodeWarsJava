package kyu8.AddLength;

/*# Add Length (8 kyu)

# https://www.codewars.com/kata/559d2284b5bb6799e9000047
# Sprache: Java
# Datum: 03.02.2026

# Aufgabe:
# Ein String mit mehreren Wörtern wird übergeben
# Für jedes Wort soll die Länge berechnet werden
# Die Länge wird direkt hinter das Wort angehängt
# Rückgabe erfolgt als String Array

# Beispiel:
# "apple ban"
# Ergebnis:
# ["apple 5", "ban 3"]

# Regeln:
# Wörter sind immer durch Leerzeichen getrennt
# Mindestens ein Wort ist vorhanden
# Jedes Wort bekommt exakt ein Leerzeichen und danach seine Länge

# Lösungsansatz:
# String mit split in einzelne Wörter zerlegen
# Über jedes Wort iterieren
# Wortlänge mit length bestimmen
# Neues Format "wort länge" zusammensetzen
# Ergebnis im Array speichern und zurückgeben

# Alternative Lösung:
# Nutzung von Streams mit map
# Jedes Wort direkt transformieren
# Kürzerer und funktionaler Code

# Code Idee:
# Arrays.stream(str.split(" "))
#       .map(w -> w + " " + w.length())
#       .toArray(String[]::new);

# Lernpunkte:
# String Verarbeitung mit split
# Arbeiten mit Arrays
# Umgang mit length
# String Verkettung
# Vergleich Schleife vs Stream Ansatz
# Schreiben kompakter und lesbarer Transformationen
*/

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