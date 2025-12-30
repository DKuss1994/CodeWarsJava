package kyu7.FindTheCapitals;
/*# Find the capitals (7 kyu)

# https://www.codewars.com/kata/539ee3b6757843632d00026b/train/java
# Sprache: Java
# Datum: 2025-12-XX

# Aufgabe:
# Schreibe eine Funktion, die alle Positionen von Großbuchstaben
# in einem String findet und diese als geordnetes Integer Array zurückgibt.
#
# Die Funktion soll:
# - den String Zeichen für Zeichen durchlaufen
# - erkennen, ob ein Zeichen ein Großbuchstabe ist
# - den Index jedes Großbuchstabens speichern
# - die Indizes in der richtigen Reihenfolge zurückgeben
#
# Beispiel:
# Eingabe:  "CodEWaRs"
# Ausgabe:  [0, 3, 4, 6]
#
# Ich habe gelernt:
# - wie man Strings in Char Arrays umwandelt
# - wie man mit Character.isUpperCase Großbuchstaben erkennt
# - wie man Indizes während einer Schleife korrekt speichert
# - wie man eine ArrayList in ein int Array umwandelt
# - wie man Listen nutzt, wenn die Größe des Ergebnisses vorher nicht bekannt ist
*/

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