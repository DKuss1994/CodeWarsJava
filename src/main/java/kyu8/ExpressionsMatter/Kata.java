package kyu8.ExpressionsMatter;
/*# Expressions Matter (8 kyu)

# https://www.codewars.com/kata/5ae62fcf252e66d44d00008e
# Sprache: Java
# Datum: 26.02.2026

# Aufgabe:
# Gegeben sind drei positive Integer a, b und c.
# Ziel ist es, durch Einsetzen der Operatoren + und *
# sowie optionaler Klammern den größtmöglichen Wert zu erzeugen.
# Die Reihenfolge der Zahlen darf nicht verändert werden.

# Bedingung:
# 1 ≤ a, b, c ≤ 10
# Operanden dürfen nicht vertauscht werden
# Operatoren dürfen mehrfach verwendet werden
# Klammern sind erlaubt, aber nicht verpflichtend

# Beispiele:
# expressionsMatter(1, 2, 3) -> 9
# (1 + 2) * 3 = 9

# expressionsMatter(1, 1, 1) -> 3
# 1 + 1 + 1 = 3

# expressionsMatter(9, 1, 1) -> 18
# 9 * (1 + 1) = 18

# Lösungsansatz:
# Alle relevanten Kombinationen explizit berechnen:
# a * b * c
# a + b + c
# (a + b) * c
# a * (b + c)
# Diese Werte in einer Liste speichern
# Anschließend den größten Wert per Schleife ermitteln

# Code Ideen:
# int max = 0;
# for (Integer value : list)
#   if (value > max) max = value;

# Lernpunkte:
# Verständnis von Operatorrangfolge
# Einfluss von Klammern auf Berechnungen
# Systematisches Durchgehen aller möglichen Fälle
# Arbeiten mit Collections
# Manuelles Bestimmen eines Maximums
*/
import java.util.ArrayList;

public class Kata {
    public static int expressionsMatter(int a, int b, int c) {
        int mulit = a * b * c;
        int addi = a + b + c;
        int firstaddi = (a + b) * c;
        int secoendaddi = a * (b + c);
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(mulit);
        list.add(addi);
        list.add(firstaddi);
        list.add(secoendaddi);
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
