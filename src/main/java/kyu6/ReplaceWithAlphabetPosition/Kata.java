package kyu6.ReplaceWithAlphabetPosition;

import java.util.HashMap;
import java.util.Map;

/*# Replace With Alphabet Position (6 kyu)

# https://www.codewars.com/kata/546f922b54af40e1e90001da
# Sprache: Java
# Datum: 12.02.2026

# Aufgabe:
# Schreibe eine Funktion, die jeden Buchstaben in einem String durch seine Position im Alphabet ersetzt.
# Buchstaben sind case-insensitive.
# Alle anderen Zeichen werden ignoriert.

# Beispiele:
# Input: "The sunset sets at twelve o' clock."
# Output: "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"

# Lösungsansatz:
# 1. String in Kleinbuchstaben umwandeln
# 2. Jeden Buchstaben prüfen:
#    - Wenn Buchstabe: Position berechnen ('a' = 1, 'b' = 2, …)
#    - Anhängen an StringBuilder
# 3. Leerzeichen zwischen Zahlen einfügen
# 4. Letztes Leerzeichen entfernen
# 5. Ergebnis als String zurückgeben

# Optimierung:
# - Map für Buchstabenposition ist optional
# - Direkte Berechnung: pos = Character.toLowerCase(c) - 'a' + 1

# Lernpunkte:
# - Umgang mit StringBuilder
# - Character-Operationen
# - Ignorieren von Nicht-Buchstaben
# - Schleifen und bedingte Logik
# - Optional: Nutzung von Maps für Mapping

# Zeitkomplexität:
# O(n), n = Länge des Strings
*/

class Kata {
    static String alphabetPosition(String text) {
        if(text.isEmpty()){
            return text;
        }
        String lowerCase = text.toLowerCase();
        char [] keys = lowerCase.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character, String> value = getCharacterStringMap();
        for (char key : keys) {
if(value.containsKey(key)){
    stringBuilder.append(value.get(key));
    stringBuilder.append(" ");
}
        }
        if(stringBuilder.length()-1 != -1) {
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }

        return String.valueOf(stringBuilder);
    }

    private static Map<Character, String> getCharacterStringMap() {
        Map<Character,String> value = new HashMap<>();
        value.put('a',"1");
        value.put('b',"2");
        value.put('c',"3");
        value.put('d',"4");
        value.put('e',"5");
        value.put('f',"6");
        value.put('g',"7");
        value.put('h',"8");
        value.put('i',"9");
        value.put('j',"10");
        value.put('k',"11");
        value.put('l',"12");
        value.put('m',"13");
        value.put('n',"14");
        value.put('o',"15");
        value.put('p',"16");
        value.put('q',"17");
        value.put('r',"18");
        value.put('s',"19");
        value.put('t',"20");
        value.put('u',"21");
        value.put('v',"22");
        value.put('w',"23");
        value.put('x',"24");
        value.put('y',"25");
        value.put('z',"26");
        return value;
    }

    public static String alphabetPositionSmart(String strings) {
        StringBuilder sb = new StringBuilder();

        for (char c : strings.toCharArray()) {
            if(Character.isLetter(c)){
                int pos = Character.toLowerCase(c) -'a'+1;
                sb.append(pos).append(" ");
            }
        }
        if(sb.length()<=0){
            return "";
        }
        sb.setLength(sb.length()-1);
        return sb.toString();


    }
}
