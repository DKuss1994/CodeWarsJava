package kyu6;

import java.util.ArrayList;
import java.util.stream.IntStream;
/*# Array.diff (6 kyu)

# https://www.codewars.com/kata/523f5d21c841566fde000009/solutions/java
# Sprache: Java
# Datum: 2025-12-21

# Aufgabe:
# Implementiere eine Funktion, die alle Elemente aus einem Array entfernt,
# die in einem zweiten Array enthalten sind.
# Die Reihenfolge der verbleibenden Elemente muss erhalten bleiben.

# Die Funktion soll:
# - jedes Element aus dem ersten Array prüfen
# - vergleichen, ob es im zweiten Array vorkommt
# - nur die Werte übernehmen, die nicht entfernt werden sollen
# - das Ergebnis wieder als Array zurückgeben
# - optional auch eine Lösung mit Java Streams verwenden

# Besonderheit:
# - Mehrfache Vorkommen müssen vollständig entfernt werden
# - Ein leeres zweites Array darf nichts verändern

# Beispiel:
# Eingabe:  a = [1, 2, 2, 2, 3], b = [2]
# Ausgabe:  [1, 3]

# Ich habe gelernt:
# - wie man zwei Arrays logisch miteinander vergleicht
# - wie man Filterlogik mit verschachtelten Schleifen umsetzt
# - wie man Schleifen mit Labels gezielt steuert
# - warum Listen für dynamische Ergebnisse besser geeignet sind als Arrays
# - wie man eine Liste wieder in ein Array umwandelt
# - wie man Java Streams für Array-Filterung nutzt
# - wie man Sonderfälle wie leere Arrays sauber behandelt
*/


public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> holder= new ArrayList<>();
        if (extracted(a, b, holder)) return a;
        int[] newA = getNewA(holder);
        return newA;
    }

    private static int[] getNewA(ArrayList<Integer> holder) {
        int[] newA = new int[holder.size()];
        for (int i1 = 0; i1 < holder.size(); i1++) {
            newA[i1]= holder.get(i1);

        }
        return newA;
    }

    private static boolean extracted(int[] a, int[] b, ArrayList<Integer> holder) {
        if(0 == b.length){
            return true;
        }
        outer:
        for (int i : a) {
            for (int i1 : b) {
                if (i==i1){
                    continue outer;

            }

            }
            holder.add(i);
        }
        return false;
    }
    public static int [] arrayDiffSteam (int[] a, int[] b){
        return IntStream.of(a).filter(x->IntStream.of(b).noneMatch(y->y==x)).toArray();
    }

}

