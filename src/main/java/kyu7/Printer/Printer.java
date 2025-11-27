package kyu7.Printer;

import java.util.ArrayList;

/*# Druckerfehler (7 kyu)

# https://www.codewars.com/kata/56541980fa08ab47a0000040/java
        # Sprache: Java
# Datum: 2025-11-21

        # Aufgabe:
        # In einer Fabrik druckt ein Drucker Etiketten für Boxen.
        # Für eine Boxenart darf der Drucker nur Farben verwenden, die mit den Buchstaben
        # von a bis m bezeichnet sind.
        #
        # Die verwendeten Farben werden in einem Kontrollstring aufgezeichnet.
        # Beispiel für einen „guten“ Kontrollstring: "aaabbbbhaijjjm"
        # - drei Mal 'a', vier Mal 'b', einmal 'h', einmal 'a'...
        #
        # Manchmal gibt es Probleme: Farben fehlen oder es gibt technische Störungen,
        # wodurch ein „schlechter“ Kontrollstring entsteht, z.B. "aaaxbbbbyyhwawiwjjjwwm"
        # mit Buchstaben außerhalb von a bis m.
        #
        # Schreibe eine Funktion printer_error, die den Fehleranteil des Druckers
        # als String zurückgibt, in der Form "Fehleranzahl/Länge des Strings".
        # Vereinfache den Bruch nicht.
        #
        # Hinweise:
        # - Der String hat mindestens eine Länge von 1.
        # - Enthält nur Buchstaben von a bis z.

        # Beispiele:
        # s = "aaabbbbhaijjjm" -> "0/14"
        # s = "aaaxbbbbyyhwawiwjjjwwm" -> "8/22"

# Ich hab gelernt, wie man überprüft, welche Buchstaben in einem String zulässig sind,
# wie man Fehler zählt und sie als Bruch darstellt.
# Außerdem habe ich verstanden, dass man manchmal ArrayLists nutzen kann,
# aber es auch kürzer geht, indem man die Buchstaben direkt vergleicht.
*/


public class Printer {

    public static String printerError(String s) {
        int counterError = 0;
        ArrayList<Character> druckerFarbe = new ArrayList<>();
        druckerFarbe.add('a');
        druckerFarbe.add('b');
        druckerFarbe.add('c');
        druckerFarbe.add('d');
        druckerFarbe.add('e');
        druckerFarbe.add('f');
        druckerFarbe.add('g');
        druckerFarbe.add('h');
        druckerFarbe.add('i');
        druckerFarbe.add('j');
        druckerFarbe.add('k');
        druckerFarbe.add('l');
        druckerFarbe.add('m');

        for (int i = 0; i < s.length(); i++) {
            if (!druckerFarbe.contains(s.charAt(i))) {
                counterError++;

            }
        }



        return counterError + "/" + s.length();

    }
}