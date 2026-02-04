package kyu8.Ascii;
/*# Get Character from ASCII Value (8 kyu)

# https://www.codewars.com/kata/55ad04714f0b468e8200001c
# Sprache: Java
# Datum: 03.02.2026

# Aufgabe:
# Eine Zahl wird übergeben
# Diese Zahl repräsentiert einen ASCII Code
# Die Funktion soll das zugehörige Zeichen zurückgeben

# Beispiel:
# 65 -> 'A'
# 97 -> 'a'
# 48 -> '0'

# Regeln:
# Eingabe ist immer eine gültige Ganzzahl
# Jede Zahl besitzt ein entsprechendes ASCII Zeichen
# Rückgabe erfolgt als char

# Lösungsansatz:
# In Java kann ein int direkt in char umgewandelt werden
# Durch Type Casting wird der Zahlenwert als ASCII Zeichen interpretiert
# Keine Schleifen oder Bedingungen notwendig

# Code Idee:
# return (char) c;

# Lernpunkte:
# Verständnis der ASCII Tabelle
# Zusammenhang zwischen Zahlen und Zeichen
# Type Casting von int zu char
# Wissen dass char intern als Zahl gespeichert wird
# Schreiben extrem kompakter Lösungen ohne unnötige Logik
*/

public class Ascii {
    public static char getChar(int c) {
        return (char) c;
    }
}
