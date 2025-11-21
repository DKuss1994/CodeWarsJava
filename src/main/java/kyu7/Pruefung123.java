package kyu7;

import java.util.ArrayList;
import java.util.List;
/*# Zeilennummerierung (8 kyu)

# https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java
        # Sprache: Java
# Datum: 2025-11-21

        # Aufgabe: Dein Team entwickelt einen neuen Texteditor, und du sollst die Zeilennummerierung implementieren.
        # Schreibe eine Funktion, die eine Liste von Strings erhält und jede Zeile mit der richtigen Nummer versieht.
        # Die Nummerierung beginnt bei 1. Das Format lautet: n: string
        # Achte auf den Doppelpunkt und das Leerzeichen zwischen Nummer und Text.

        # Beispiele:
        # [] -> []
        # ["a", "b", "c"] -> ["1: a", "2: b", "3: c"]
        # ["line"] -> ["1: line"]

# Ich hab gelernt, wie man Listen durchläuft und jedem Element automatisch eine fortlaufende Nummer voranstellt.
*/


public class Pruefung123 {

    public static List<String> LineNumbering(List<String> lines) {
        List<String> result = new ArrayList<>();
        if (!lines.isEmpty()) {
            for (int x = 0; x < lines.size(); x++) {
                result.add((x + 1) + ": " + lines.get(x));

            }
            return result;
        }
        return lines;

    }
}
