package kyu8.CuboidVolumes;
/*# Difference of Cuboid Volumes (8 kyu)

# https://www.codewars.com/kata/58cb43f4256836ed95000f97
# Sprache: Java

# Aufgabe:
# Zwei Integer Arrays repräsentieren die Seitenlängen von zwei Quadern.
# Jedes Array enthält genau 3 positive Zahlen.
#
# Beispiel:
# [2, 2, 3] -> Volumen = 12
# [5, 4, 1] -> Volumen = 20
#
# Gesucht:
# Die absolute Differenz der beiden Volumen
# Ergebnis -> 8

# Lösungsidee:
# 1. Volumen berechnen: Länge * Breite * Höhe
# 2. Für beide Arrays multiplizieren
# 3. Differenz bilden
# 4. Math.abs verwenden, damit das Ergebnis immer positiv ist

# Umsetzung:
# Arrays.stream(...).reduce(1, (a, b) -> a * b)
# startet mit 1 und multipliziert alle Werte miteinander

# Warum reduce:
# Elegant und funktional
# Keine Schleife nötig
# Sehr kompakt, sogar in einer Zeile möglich

# Lernpunkte:
# Streams
# reduce als Multiplikations-Akkumulator
# Lambda Ausdrücke
# Math.abs
# Funktionaler Stil statt for Schleife

# Zeitkomplexität:
# O(1), da immer nur 3 Werte pro Array
*/

import java.util.Arrays;

public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        return Math.abs(Arrays.stream(firstCuboid).reduce(1, (a, b) -> a * b) -
                Arrays.stream(secondCuboid).reduce(1, (a, b) -> a * b));
    }
}
