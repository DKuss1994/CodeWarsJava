package kyu7.XO;
/*
# Exes and Ohs (7 kyu)

# Sprache: Java
# Datum: 2025-12-17

# Aufgabe:
# Es soll geprüft werden, ob ein String gleich viele Buchstaben x und o enthält.
# Die Groß und Kleinschreibung darf keine Rolle spielen.
# Alle anderen Zeichen im String sind irrelevant.
# Wenn weder x noch o vorkommen, soll true zurückgegeben werden.

# Beispiele:
# "ooxx"   -> true
# "xooxx" -> false
# "ooxXm" -> true
# "zpzpzpp" -> true
# "zzoo" -> false

# Lösung 1:
# Der String wird zuerst in Kleinbuchstaben umgewandelt.
# Danach wird über jedes Zeichen iteriert.
# Bei jedem x wird ein Zähler erhöht.
# Bei jedem o wird ein zweiter Zähler erhöht.
# Am Ende wird geprüft, ob beide Zähler gleich sind.

# Lösung 2:
# Der String wird ebenfalls in Kleinbuchstaben umgewandelt.
# Anschließend werden alle x entfernt und die Länge gemessen.
# Danach werden alle o entfernt und die Länge gemessen.
# Sind beide Längen gleich, ist die Anzahl von x und o identisch.

# Besonderheit:
# Wenn kein x und kein o im String vorkommt,
# bleiben beide Zähler gleich und das Ergebnis ist true.

# Ich habe gelernt:
# wie man Zeichen in Strings zählt
# wie man Case Insensitivity sauber umsetzt
# dass es oft mehrere gültige Lösungswege gibt
# dass String Manipulation eine Alternative zu Schleifen sein kann
# dass Randfälle wie keine Treffer explizit bedacht werden müssen
*/

public class XO {

    public static boolean getXO(String str) {
        int x = 0;
        int o = 0;
        char xChar = 'x';
        char oChar = 'o';
        str = str.toLowerCase();
        char[] strChar = str.toCharArray();
        for (char c : strChar) {
            if (c == xChar) {
                x++;
            }
            if (c == oChar) {
                o++;
            }
        }
        return x==o;

    }
    public static  boolean getXOLength (String str) {
        str = str.toLowerCase();
        return str.replaceAll("x","").length()==str.replaceAll("o","").length();
    }
}
