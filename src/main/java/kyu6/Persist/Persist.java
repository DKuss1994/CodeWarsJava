package kyu6.Persist;
/*# Persistent Bugger (6 kyu)

# https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
# Sprache: Java
# Datum: 2025-12-31

# Aufgabe:
# Schreibe eine Funktion, die die multiplikative Persistenz einer Zahl berechnet.
# Die Persistenz gibt an, wie oft die Ziffern einer Zahl miteinander multipliziert werden müssen,
# bis nur noch eine einstellige Zahl übrig bleibt.
#
# Die Funktion soll:
# eine positive Zahl entgegennehmen
# die einzelnen Ziffern extrahieren
# diese Ziffern miteinander multiplizieren
# den Vorgang wiederholen, bis nur noch eine Ziffer vorhanden ist
# und zählen, wie viele Durchläufe dafür nötig sind
#
# Beispiel:
# Eingabe: 39
# Ablauf: 3 mal 9 gleich 27
#         2 mal 7 gleich 14
#         1 mal 4 gleich 4
# Ausgabe: 3
#
# Ich habe gelernt:
# wie man Zahlen in Strings umwandelt, um auf einzelne Ziffern zuzugreifen
# wie man Zeichen wieder in Zahlen konvertiert
# wie man Schleifen benutzt, um einen Prozess wiederholt auszuführen
# wie man Hilfsmethoden einsetzt, um Code übersichtlich zu halten
# wie man mit Abbruchbedingungen arbeitet, sobald ein Zielzustand erreicht ist
*/


class Persist {
    public static int persistence(long n) {
        int count = 0;
        final char TONUMBER = '0';
        String valueString = String.valueOf(n);
        while (valueString.length() != 1) {
            int value = 1;
            char[] valueCharArray = valueString.toCharArray();
            valueString = multiplicativeTheValue(valueCharArray, value, TONUMBER);
            count++;
        }

        return count;
    }

    private static String multiplicativeTheValue(char[] valueCharArray, int value, char TONUMBER) {
        String valueString;
        for (char c : valueCharArray) {
            value *= (c - TONUMBER);
        }
        valueString = String.valueOf(value);
        return valueString;
    }


}
