package kyu8.numberToString;

/*# Convert a Number to a String! (8 kyu)

# https://www.codewars.com/kata/5265326f5fda8eb1160004c8
# Sprache: Java
# Datum: 12.01.2026

# Aufgabe:
# Erstelle eine Funktion, die eine Ganzzahl in einen String umwandelt.
# Die Zahl kann positiv oder negativ sein.

# Eingabe:
# Eine Ganzzahl vom Typ int

# Ausgabe:
# Ein String mit der entsprechenden textuellen Darstellung der Zahl

# Beispiele:
# 123 -> "123"
# 999 -> "999"
# -100 -> "-100"

# Regeln:
# Es wird immer eine gültige Ganzzahl übergeben
# Es müssen keine Sonder oder Fehlerfälle behandelt werden

# Lösungsansatz:
# Verwendung einer Standard Java Methode zur Umwandlung von int zu String
# Der Fokus liegt auf Lesbarkeit und Einfachheit

# Ich habe gelernt:
# wie man primitive Datentypen in Strings umwandelt
# dass Java mehrere eingebaute Wege für Typkonvertierungen bietet
# wie man einfache Aufgaben präzise und sauber löst
*/

class numberToString {
    public static String numberToString(int num) {
        return String.valueOf(num);
    }
}