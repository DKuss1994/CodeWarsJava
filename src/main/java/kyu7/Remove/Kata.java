package kyu7.Remove;
/*
# Remove anchor from URL (7 kyu)

# https://www.codewars.com/kata/51f2b4448cadf20ed0000386/train/java
# Sprache: Java
# Datum: 2025-12-17

# Aufgabe:
# Eine URL soll so verändert werden, dass alles nach einem Ankerzeichen # entfernt wird.
# Existiert kein # in der URL, soll sie unverändert zurückgegeben werden.

# Beispiele:
# "www.codewars.com#about" -> "www.codewars.com"
# "www.codewars.com?page=1" -> "www.codewars.com?page=1"

# Lösung 1 removeUrlAnchor:
# Zuerst wird geprüft, ob das Zeichen # überhaupt existiert.
# Falls nicht, wird die ursprüngliche URL direkt zurückgegeben.
# Falls doch, wird die Position des # ermittelt.
# Anschließend wird Zeichen für Zeichen bis zu dieser Position
# in einen StringBuilder übernommen.

# Lösung 2 removeUrlSplit:
# Die URL wird am Zeichen # gesplittet.
# Der erste Teil des Arrays ist immer der gewünschte URL Teil.
# Diese Variante ist deutlich kürzer und gut lesbar.

# Ich habe gelernt:
# wie man indexOf sinnvoll zur Prüfung verwendet
# wie man Strings manuell mit StringBuilder zusammensetzt
# wie einfach split für solche Aufgaben genutzt werden kann
# dass mehrere Lösungswege existieren und Lesbarkeit oft gewinnt
*/

public class Kata {
    public static String removeUrlAnchor(String url) {
        int index = url.indexOf('#');
        if (index == -1) {
            return url;
        } else {
            StringBuilder newLink = new StringBuilder();
            char[] urlCharArray = url.toCharArray();
            for (int i = 0; i < index; i++) {
                newLink.append(urlCharArray[i]);
            }
            return newLink.toString();
        }
    }
    public static String removeUrlSplit (String url){
        return url.split("#")[0];
    }
}