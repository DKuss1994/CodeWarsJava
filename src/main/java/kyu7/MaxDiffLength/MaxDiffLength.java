package kyu7.MaxDiffLength;
/*# Maximum Length Difference (7 kyu)

# https://www.codewars.com/kata/5663f5305102699bad000056
# Sprache: Java
# Datum: 11.02.2026

# Aufgabe:
# Gegeben sind zwei String Arrays a1 und a2.
# Jeder String besteht nur aus Kleinbuchstaben.
#
# Gesucht ist:
# max( | length(x) − length(y) | )
# wobei x aus a1 und y aus a2 stammt.

# Sonderfall:
# Wenn eines der Arrays leer ist -> -1 zurückgeben

# Beispiel:
# a1 = ["hoqq", "bbllkw", "oox"]
# a2 = ["cccooommaaqqoxii"]
# Ergebnis -> 13

# Lösungsansatz:
# 1. Kürzeste und längste Stringlänge in beiden Arrays bestimmen
# 2. Nur diese Extremwerte sind relevant
# 3. Zwei Differenzen vergleichen:
#    max1 - min2
#    max2 - min1
# 4. Größeren Wert zurückgeben

# Warum funktioniert das:
# Die maximale Differenz entsteht immer zwischen einem sehr langen
# und einem sehr kurzen String, niemals zwischen mittleren Werten.

# Lernpunkte:
# Arrays.stream verwenden
# mapToInt(String::length)
# min() und max()
# OptionalInt mit getAsInt()
# Mathematische Optimierung statt Doppelschleife
# Zeitkomplexität O(n + m) statt O(n * m)
*/

import java.util.Arrays;

class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        int min1 = Arrays.stream(a1).mapToInt(String::length).min().getAsInt();
        int max1 = Arrays.stream(a1).mapToInt(String::length).max().getAsInt();
        int min2 = Arrays.stream(a2).mapToInt(String::length).min().getAsInt();
        int max2 = Arrays.stream(a2).mapToInt(String::length).max().getAsInt();
return Math.max(Math.abs(max1-min2),Math.abs(max2-min1));
    }
}