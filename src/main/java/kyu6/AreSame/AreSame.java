package kyu6.AreSame;

import java.util.Arrays;
/*# Are they the same (6 kyu)

# https://www.codewars.com/kata/550498447451fbbd7600041c/train/java
# Sprache: Java
# Datum: 02.01.2026

# Aufgabe:
# Schreibe eine Funktion comp, die zwei Integer Arrays vergleicht.
# Es soll geprüft werden, ob jedes Element im zweiten Array
# das Quadrat eines Elements aus dem ersten Array ist.
# Die Reihenfolge spielt keine Rolle, die Häufigkeit der Werte jedoch schon.
#
# Die Funktion soll:
# false zurückgeben, wenn eines der Arrays null ist
# true zurückgeben, wenn beide Arrays leer sind
# false zurückgeben, wenn die Längen unterschiedlich sind
# alle Werte aus a quadrieren
# beide Arrays sortieren
# und anschließend elementweise vergleichen
#
# Beispiel:
# a = [121, 144, 19, 161, 19, 144, 19, 11]
# b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
# Ergebnis: true
#
# Ich habe gelernt:
# wie man Streams verwendet, um Arrays zu transformieren
# wie man map nutzt, um Werte zu verändern
# wie man Arrays sortiert und vergleicht
# wie man mit Sonderfällen wie null und leeren Arrays umgeht
# wie wichtig saubere Tests für Grenzfälle sind
*/

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if(a==null||b==null){
            return false;
        }
        if (a.length == 0 && b.length == 0) {
            return true;
        }

        if (a.length != b.length) {
            return false;
            } else {
            return Arrays.equals(Arrays.stream(a).map(n->n*n).sorted().toArray(),Arrays
                    .stream(b).sorted().toArray());

        }

    }
}