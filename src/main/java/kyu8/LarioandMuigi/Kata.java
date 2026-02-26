package kyu8.LarioandMuigi;
/*# Pipe Fix (8 kyu)

# https://www.codewars.com/kata/56b29582461215098d00000f
# Sprache: Java
# Datum: 26.02.2026

# Aufgabe:
# Gegeben ist ein sortiertes Array mit eindeutigen Zahlen in aufsteigender Reihenfolge.
# Zwischen dem kleinsten und größten Wert können jedoch Zahlen fehlen.
# Ziel ist es, ein neues Array zu erzeugen, das alle Zahlen
# vom Minimum bis zum Maximum in Einerschritten enthält.

# Bedingung:
# Das Eingabearray ist sortiert
# Die Zahlen sind eindeutig
# Das Ergebnis soll alle Werte von numbers[0] bis numbers[last] enthalten
# Beide Grenzen sind inklusive

# Beispiel:
# Input:  1,3,5,6,7,8
# Output: 1,2,3,4,5,6,7,8

# Lösungsansatz:
# Den kleinsten Wert über numbers[0] bestimmen
# Den größten Wert über numbers[numbers.length - 1] bestimmen
# Mit einer Schleife alle Werte von min bis max erzeugen
# Diese in einer ArrayList speichern
# Anschließend in ein int Array umwandeln und zurückgeben

# Code Ideen:
# for (int i = numbers[0]; i <= numbers[last]; i++)
#   list.add(i);

# Lernpunkte:
# Arbeiten mit Array-Grenzen
# Nutzung von numbers.length - 1 für das letzte Element
# Erzeugen einer lückenlosen Zahlenreihe
# Umwandlung von ArrayList in ein primitives int Array
# Verständnis von inklusiven Schleifenbedingungen
*/
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        ArrayList<Integer> value = new ArrayList<>();
        for (int i = numbers[0]; i <= numbers[numbers.length-1]; i++) {
            value.add(i);

        }
        int [] newValue = new int[value.size()];
        for (int i = 0; i < newValue.length; i++) {
            newValue[i] = value.get(i);
        }

        return newValue;
    }

    public static int[] pipeFixStream(int[] input) {
            return IntStream.rangeClosed(input [0],input[input.length-1]).toArray();
    }
}
