package kyu7.AnagramDetection;
/*# Anagram Detection (7 kyu)

# https://www.codewars.com/kata/529eef7a9194e0cbc1000255
# Sprache: Java
# Datum: 28.01.2026

# Aufgabe:
# Schreibe eine Funktion, die prüft, ob zwei Strings Anagramme sind
# Ein Anagramm entsteht durch das Umordnen der Buchstaben eines Wortes
# Groß und Kleinschreibung soll ignoriert werden

# Regeln:
# Beide Strings müssen gleich lang sein
# Die Häufigkeit jedes Buchstabens muss übereinstimmen
# Die Reihenfolge der Buchstaben ist egal
# Groß und Kleinschreibung spielt keine Rolle

# Beispiele:
# "foefet" und "toffee" -> true
# "Buckethead" und "DeathCubeK" -> true
# "abc" und "def" -> false

# Lösungsansatz 1 HashMap:
# Beide Strings in Kleinbuchstaben umwandeln
# Zeichen zählen und in einer Map speichern
# Maps vergleichen
# Sind beide Maps gleich, ist es ein Anagramm

# Lösungsansatz 2 Sortieren:
# Beide Strings in Char Arrays umwandeln
# Arrays sortieren
# Arrays vergleichen

# Lösungsansatz 3 Streams:
# Strings in einzelne Zeichen aufteilen
# Zeichen sortieren
# Wieder zu einem String zusammenfügen
# Ergebnis vergleichen

# Lernpunkte:
# Umgang mit HashMaps und Zeichenhäufigkeiten
# Vergleich unterschiedlicher Lösungsansätze
# Einsatz von Arrays sortieren
# Verwendung von Streams für funktionale Lösungen
# Schreiben und Absichern von Unit Tests
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
    public static boolean isAnagram(String a, String b) {
        Map<Character, Integer> numbersOfCharsA = new HashMap<>();
        Map<Character, Integer> numbersOfCharsB = new HashMap<>();
        if (a.length() == b.length()) {
            char[] aChar = a.toLowerCase().toCharArray();
            char[] bChar = b.toLowerCase().toCharArray();
            extracted(aChar, numbersOfCharsA);
            extracted(bChar, numbersOfCharsB);
            return numbersOfCharsA.equals(numbersOfCharsB);

        } else {
            return false;
        }
    }

    private static void extracted(char[] bChar, Map<Character, Integer> numbersOfCharsB) {
        for (char c : bChar) {
            if (numbersOfCharsB.containsKey(c)) {
                numbersOfCharsB.replace(c, numbersOfCharsB.get(c) + 1);
            } else {
                numbersOfCharsB.put(c, 1);

            }
        }
    }

    public static boolean isAnagramSort(String s, String s1) {
        if (s == null||s1==null||s.length()!=s1.length()) {
            return false;
        }
        char[]sChar=s.toLowerCase().toCharArray();
        char[]s1Char=s1.toLowerCase().toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(s1Char);
        return Arrays.equals(sChar,s1Char);


    }

    public static boolean isAnagramStream(String s, String s1) {
        return Stream.of(s.toLowerCase().split("")).sorted()
                .collect(Collectors.joining()).equals(Stream.of(s1.toLowerCase().split(""))
                        .sorted().collect(Collectors.joining()));
    }
}