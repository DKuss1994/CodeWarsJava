package kyu6.SmileFaces;

import java.util.List;
/*# Count the Smiley Faces! (6 kyu)

# https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java
# Sprache: Java
# Datum: 2025-12-27

# Aufgabe:
# Gegeben ist eine Liste von Strings, die mögliche Smileys darstellen.
# Die Aufgabe ist es, zu zählen, wie viele dieser Strings gültige
# lächelnde Gesichter sind.

# Regeln für gültige Smileys:
# - Die Augen müssen entweder : oder ; sein
# - Eine Nase ist optional und darf - oder ~ sein
# - Der Mund muss ) oder D sein
# - Es dürfen keine anderen Zeichen enthalten sein
# - Die Reihenfolge ist immer Augen, optional Nase, Mund

# Die Funktion soll:
# - jeden String einzeln prüfen
# - zwischen Smileys mit und ohne Nase unterscheiden
# - nur gültige Smileys zählen
# - bei einer leeren Liste 0 zurückgeben

# Beispiele:
# Eingabe:  [":)", ";(", ";}", ":-D"]
# Ausgabe:  2
#
# Eingabe:  [";D", ":-(", ":-)", ";~)"]
# Ausgabe:  3
#
# Eingabe:  [";]", ":[", ";*", ":$", ";-D"]
# Ausgabe:  1

# Erweiterung:
# Zusätzlich habe ich eine Lösung mit Java Streams umgesetzt.
# Dabei wird:
# - über die Liste gestreamt
# - mit einer Regular Expression geprüft ob der Smiley gültig ist
# - die Anzahl der Treffer gezählt

# Ich habe gelernt:
# - wie man Strings in einzelne Zeichen zerlegt
# - wie man Zeichen gezielt vergleicht
# - wie man verschachtelte Bedingungen logisch sauber aufbaut
# - wie man Regular Expressions zur Validierung einsetzt
# - wie man Java Streams mit filter und count verwendet
# - wie man imperativen und funktionalen Code miteinander vergleicht
*/

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String s : arr) {
            char[] smile = s.toCharArray();
            if (smile.length == 2) {
                if (smile[0] == ':' || smile[0] == ';') {
                    if (smile[1] == ')' || smile[1] == 'D') {
                        count++;
                    }
                }
            } else if (smile.length == 3) {
                if (smile[0] == ':' || smile[0] == ';') {
                    if (smile[1] == '-' || smile[1] == '~') {
                        if (smile[2] == 'D' || smile[2] == ')') {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static int countSmileysStream(List<String> arr){
        return (int) arr.stream().filter(x -> x.matches("[:;][-~]?[D)]")).count();
    }
}

