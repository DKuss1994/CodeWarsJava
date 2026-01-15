package kyu6.Two_Sum;
/*# Two Sum (6 kyu)

# https://www.codewars.com/kata/52c31f8e6605bcc646000082
# Sprache: Java
# Datum: 15.01.2026

# Aufgabe:
# Gegeben ist ein Array aus Ganzzahlen und ein Zielwert
# Es sollen zwei unterschiedliche Elemente gefunden werden,
# deren Summe genau dem Zielwert entspricht
# Zurückgegeben werden die Indizes dieser beiden Elemente

# Bedingungen:
# Das Array enthält mindestens zwei Elemente
# Es existiert immer mindestens eine gültige Lösung
# Die Reihenfolge der Indizes ist egal
# Es dürfen nicht dieselben Indizes doppelt verwendet werden

# Eingabe:
# numbers   Array aus int Werten
# target    Zielwert als int

# Ausgabe:
# int Array mit genau zwei Indizes

# Beispiele:
# [1, 2, 3], target 4  -> [0, 2]
# [3, 2, 4], target 6  -> [1, 2]

# Lösungsansatz 1:
# Zwei verschachtelte Schleifen
# Jedes Element wird mit jedem anderen kombiniert
# Prüfung, ob die Summe dem Zielwert entspricht
# Zusätzliche Prüfung, damit nicht derselbe Index genutzt wird
# Rückgabe der gefundenen Indizes

# Lösungsansatz 2:
# Optimierte doppelte Schleife
# Die innere Schleife startet immer bei i + 1
# Dadurch wird sichergestellt, dass jedes Paar nur einmal geprüft wird
# Kein zusätzlicher Index Vergleich notwendig
# Direkte Rückgabe der Indizes bei Treffer

# Zeitkomplexität:
# O(n²)
# Für 6 kyu absolut akzeptabel und verständlich

# Ich habe gelernt:
# wie man verschachtelte Schleifen korrekt einsetzt
# warum Startpunkte von Schleifen wichtig sind
# wie man unnötige Prüfungen vermeidet
# wie man sauberen und lesbaren Code gegenüber komplexem Code bevorzugt
*/

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] value = new int[2];
        int getTheNumber;
        for (int i = 1; i < numbers.length; i++) {
            for (int i1 = 0; i1 < numbers.length - 1; i1++) {
                getTheNumber = numbers[i] + numbers[i1];
                if (i == i1) {
                    continue;
                }
                if (getTheNumber == target) {
                    value[0] = i1;
                    value[1] = i;
                    return value;
                } else {
                    getTheNumber = 0;
                }
            }
        }
        return null;
    }
    public static int[] twoSum2(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = i+1; i1 < numbers.length; i1++) {
                if(numbers[i]+numbers[i1] == target){
                    return new int[]{i,i1};
                }

            }
        }
        return null;
    }
}