package kyu8.Palindrome;

import java.util.Locale;

/*
# Is it a palindrome (8 kyu)

# https://www.codewars.com/kata/57a1fd2ce298a731b20006a4/train/java
# Sprache: Java
# Datum: 2025-12-17

# Aufgabe:
# Schreibe eine Funktion die überprüft ob ein gegebener String ein Palindrom ist.
# Die Prüfung soll unabhängig von Groß und Kleinschreibung erfolgen.

# Ein Palindrom ist ein Wort oder eine Zeichenfolge
# die vorwärts und rückwärts gelesen identisch ist.

# Beispiele:
# "madam"   ergibt true
# "Racecar" ergibt true
# "hello"   ergibt false

# Ich habe gelernt wie man Strings vereinheitlicht indem man sie in Kleinbuchstaben umwandelt
# wie man mit StringBuilder einen String umdreht
# wie man zwei Strings korrekt miteinander vergleicht
# und wie man das Ergebnis als boolean Wert zurückgibt
*/


public class Palindrome {
    public static Boolean isPalindrome(String x) {
        String text = x.toLowerCase(Locale.ROOT);
        StringBuilder stringBuilder = new StringBuilder(text);
        String textChange = stringBuilder.reverse().toString();
        return text.equals(textChange);

    }
}