package kyu8.Kata;
/*
# Find the position (8 kyu)

# https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
# Sprache: Java
# Datum: 2025-12-17

# Aufgabe:
# Gegeben ist ein einzelner Kleinbuchstabe aus dem englischen Alphabet.
# Die Funktion soll die Position dieses Buchstabens im Alphabet zurückgeben.

# Eingabe:
# 'a'

# Ausgabe:
# "Position of alphabet: 1"

# Lösungsidee:
# Ich nutze den ASCII Wert von Kleinbuchstaben.
# Der Buchstabe 'a' hat den ASCII Wert 97.
# Durch Subtraktion von 97 und Addition von 1 erhalte ich die Alphabet Position.

# Ich habe gelernt:
# wie man mit char und ASCII Werten rechnet
# wie man Zahlen in Strings umwandelt
# wie man eine formatierte Rückgabe als String erstellt
*/

public class Kata
{
    public static String position(char alphabet)
    {
        int lowerNumber = 97;
        return "Position of alphabet: "+String.valueOf(( alphabet-lowerNumber)+1);
    }
}