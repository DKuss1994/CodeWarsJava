package kyu6.CountCharactersInYourString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*# Count characters in your string (6 kyu)

# https://www.codewars.com/kata/52efefcbcdf57161d4000091
# Sprache: Java
# Datum: 08.02.2026

# Aufgabe:
# Gegeben ist ein String. Zähle, wie oft jeder Buchstabe darin vorkommt.
# Ergebnis soll als Map<Character,Integer> zurückgegeben werden.
# Beispiel:
# "aba" -> {'a': 2, 'b': 1}

# Sonderfall:
# Leerer String -> leere Map zurückgeben

# Lösungsansatz:
# Iteriere durch den String und füge Buchstaben in eine Map ein
# Wenn Buchstabe schon existiert, den Zähler erhöhen
# Alternative Lösung: Streams verwenden und mit toMap aggregieren

# Lernpunkte:
# Umgang mit Maps und Map Methoden (put, containsKey, replace)
# Streams nutzen für funktionale Lösungen
# Umgang mit leeren Eingaben
# Effizientes Zählen von Objekten in Collections
# Typkonvertierungen zwischen int und char bei Streams
*/

import static java.util.stream.Collectors.toMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character,Integer> countCharacter= new HashMap<>();
        int count = 1;
        if(str.isEmpty()){
            return countCharacter;
        }
        char [] strToChar = str.toCharArray();
        for (char c : strToChar) {

            if(countCharacter.containsKey(c)){
                Integer i = countCharacter.get(c);
                i++;
                countCharacter.replace(c,i);
            }
            else {
                countCharacter.put(c,count);
            }

        }
        return countCharacter;
    }

    public static Map<Character, Integer> countStream(String str) {
        Map<Character,Integer> value = new HashMap<>();
        return Arrays.stream(str.chars().toArray()).mapToObj(chars->(char)chars)
                .collect(toMap(chars->chars,chars->1,Integer::sum));
    }
}
