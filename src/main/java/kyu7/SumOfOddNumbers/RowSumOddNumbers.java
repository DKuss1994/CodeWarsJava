package kyu7.SumOfOddNumbers;

import java.util.ArrayList;
import java.util.List;
/*Sum of odd numbers (7 kyu)

# https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/java
        # Sprache: Java
# Datum: 2025-11-21

        # Aufgabe: Gegeben ist ein Dreieck aufeinanderfolgender ungerader Zahlen:
        #
        #          1
        #       3     5
        #    7     9    11
        # 13    15    17    19
        # 21    23    25    27    29
        # ...
        #
        # Berechne die Summe der Zahlen in der n-ten Reihe dieses Dreiecks (Index beginnt bei 1).

        # Beispiele:
        # 1 -> 1
        # 2 -> 3 + 5 = 8
        # 3 -> 7 + 9 + 11 = 27

# Ich hab gelernt, dass man die Summe der n-ten Reihe auch einfach mit n*n*n berechnen kann,
# statt alle Zahlen vorher in Listen zu erstellen. Trotzdem habe ich zuerst neue Listen erstellt, um das Prinzip zu verstehen.
*/
class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        List<List<Integer>> dreickListe = new ArrayList<>();
        int zahl = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            List<Integer> innereListe = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                innereListe.add(zahl);
                zahl += 2;
            }
            dreickListe.add(innereListe);
        }

        for (int i : dreickListe.get(n - 1)) {
            sum += i;
        }
        return sum;
    }

}
