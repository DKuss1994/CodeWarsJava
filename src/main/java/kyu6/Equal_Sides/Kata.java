package kyu6.Equal_Sides;
/*# Equal Sides Of An Array (6 kyu)

# https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
# Sprache: Java
# Datum: 2025-12-21

# Aufgabe:
# Gegeben ist ein Array von Ganzzahlen.
# Gesucht ist ein Index N, bei dem die Summe aller Elemente links von N
# gleich der Summe aller Elemente rechts von N ist.
# Das Element an Index N selbst wird dabei nicht mitgezählt.

# Die Funktion soll:
# - jeden möglichen Index im Array prüfen
# - die linke und rechte Summe für diesen Index berechnen
# - den ersten passenden Index zurückgeben
# - falls kein solcher Index existiert, -1 zurückgeben

# Besonderheit:
# - Es darf nur der erste passende Index zurückgegeben werden
# - Das Array kann auch keinen gültigen Index enthalten
# - Die Berechnung erfolgt vollständig über Schleifen

# Beispiel:
# Eingabe:  {1, 2, 3, 4, 3, 2, 1}
# Ausgabe:  3

# Ich habe gelernt:
# - wie man ein Problem schrittweise über alle Indizes löst
# - wie man linke und rechte Teilsummen korrekt berechnet
# - wie man mehrere Schleifen gezielt kombiniert
# - wie man Abbruchbedingungen sinnvoll einsetzt
# - warum ein Rückgabewert wie -1 wichtig für Fehlerfälle ist
# - wie Tests helfen, Grenzfälle abzusichern
*/
public class Kata {
    public static int findEvenIndex(int[] arr) {
        int index = -1;

        while (true){
            index++;
            int sumLeft = 0;
            int sumRight = 0;


        for (int i = index; i < arr.length; i++) {
            sumRight+= arr[i];
        }
        for (int i = index; i >= 0; i--) {
            sumLeft += arr[i];
        }
        if (sumLeft==sumRight){
        return index;
        } else if (index == arr.length-1) {
            return -1;

        }


        }
    }
}