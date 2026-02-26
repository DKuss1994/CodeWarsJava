package kyu7.SimpleFunReverseLetter;
/*# Reverse Letter (7 kyu)

# https://www.codewars.com/kata/58b8c94b7df3f116eb00005b
# Sprache: Java
# Datum: 05.02.2026

# Aufgabe:
# Gegeben ist ein String str. Der String soll umgekehrt
# werden und dabei alle nicht-alphabetischen Zeichen weggelassen werden.

# Bedingung:
# Nur Buchstaben sollen im Ergebnis enthalten sein
# Nicht-Buchstaben wie Zahlen oder Sonderzeichen ignorieren
#
# Beispiele:
# "krishan"      -> "nahsirk"
# "ultr53o?n"    -> "nortlu"
# "ab12cd!ef"    -> "fedcba"

# Lösungsansatz:
# Den String in ein Char-Array umwandeln
# Von hinten nach vorne iterieren
# Nur Buchstaben mittels Character.isLetter an den StringBuilder anhängen
# Am Ende den aufgebauten StringBuilder in einen String umwandeln

# Code Ideen:
# for (int i = str.length()-1; i >= 0; i--)
#   if (Character.isLetter(str.charAt(i))) append()
# return builder.toString()

# Lernpunkte:
# Iteration rückwärts über ein Array
# Filtern nach Alphabetische Zeichen
# Nutzung von StringBuilder für effiziente String-Erstellung
# Umgang mit Character-Hilfsmethoden
*/
public class Kata {
    public static String reverseLetter(final String str) {
        char[] charArray = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if(Character.isLetter(charArray[i])){
                stringBuilder.append(charArray[i]);
            }
        }
        return String.valueOf(stringBuilder); //coding and coding..
    }
}
