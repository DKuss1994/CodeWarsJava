package kyu6.Solution;

/*# The Supermarket Queue (6 kyu)

# https://www.codewars.com/kata/57b06f90e298a7b53d000a86
# Sprache: Java
# Datum: 02.01.2026

# Aufgabe:
# Simuliere eine Warteschlange an Supermarkt Selbstbedienungskassen.
# Kunden stehen in genau einer Schlange und gehen immer zur nächsten freien Kasse.
# Jeder Kunde benötigt eine bestimmte Zeit zum Abkassieren.
# Ziel ist es, die Gesamtzeit zu berechnen, bis alle Kunden fertig sind.

# Eingabe:
# customers: Array von positiven Integern
# Jeder Wert steht für die benötigte Checkout Zeit eines Kunden
# n: Anzahl der verfügbaren Kassen

# Ausgabe:
# Ein Integer der die gesamte benötigte Zeit angibt

# Regeln:
# Es gibt nur eine gemeinsame Warteschlange
# Die Reihenfolge der Kunden ändert sich nie
# Der nächste Kunde geht sofort zur Kasse, sobald diese frei wird
# Alle Eingaben sind gültig

# Beispiele:
# [5,3,4], n = 1 -> 12
# [10,2,3,3], n = 2 -> 10
# [2,3,10], n = 2 -> 12

# Lösungsansätze:
# 1. Lösung mit PriorityQueue
# Jede Kasse speichert ihre aktuelle Belegungszeit
# Der Kunde wird immer der aktuell freien Kasse mit der geringsten Zeit zugewiesen
#
# 2. Alternative Lösung mit Array und Sortierung
# Jede neue Kundenzeit wird der aktuell kürzesten Kasse hinzugefügt
# Danach wird das Kassenarray sortiert

# Ich habe gelernt:
# wie PriorityQueues zur Simulation von Parallelität eingesetzt werden
# wie sich das Problem mit einem Thread Pool vergleichen lässt
# wie Greedy Algorithmen funktionieren
# wie unterschiedliche Lösungsansätze die gleiche Logik abbilden
# wie man Performance bei größeren Eingaben berücksichtigt
*/

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution{

    public static int solveSuperMarketQueue (int[] customers, int n) {
        PriorityQueue<Integer> kassen = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            kassen.add(0);
        }
        for (int customer : customers) {
            int frei = kassen.poll();
            frei += customer;
            kassen.add(frei);
        }
        return kassen.stream().max(Integer::compareTo).get();
    }
    public static int solveSuperMarketQueueSort (int[] customers, int n){
        int[] kasse = new int[n];
        for (int i = 0; i < customers.length; i++) {
            kasse[0] += customers[i];
            Arrays.sort(kasse);
        }
        return kasse[n-1];

    }

}
