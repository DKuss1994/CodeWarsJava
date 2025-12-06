package kyu7.Square;
/*
# You're a square 7 kyu

# https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java
# Sprache: Java
# Datum: 2025-12-06

# Aufgabe:
# Bestimme ob eine ganze Zahl ein Quadrat ist.
# Ein Quadrat liegt vor wenn die Quadratwurzel der Zahl eine echte ganze Zahl ergibt.

# Beispiel:
# 4 ergibt true weil die Wurzel 2 ist.
# 3 ergibt false weil die Wurzel keine ganze Zahl ist.

# Ich habe gelernt wie ich Math.sqrt benutze
# wie ich mit Math.floor überprüfe ob eine Kommazahl eine ganze Zahl ist
# wie ich negative Zahlen automatisch korrekt ablehne
# und wie ich aus einer mathematischen Prüfung einen boolean Wert ableite
*/

public class Square {
    public static boolean isSquare(int n) {
        double value;
        value = Math.sqrt(n);
        if (value == Math.floor(value)) {
            return true;
        } else {
            return false;
        }
    }
}