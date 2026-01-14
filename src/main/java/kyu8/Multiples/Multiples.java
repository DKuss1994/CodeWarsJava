package kyu8.Multiples;

/*# Find Multiples of a Number (8 kyu)

# https://www.codewars.com/kata/58ca658cc0d6401f2700045f
# Sprache: Java
# Datum: 12.01.2026

# Aufgabe:
# Schreibe eine Funktion, die zwei Ganzzahlen entgegennimmt.
# base und limit
# Zurückgegeben wird eine Liste aller Vielfachen von base
# beginnend bei base bis maximal limit

# Voraussetzungen:
# base ist immer größer als 0
# limit ist immer größer oder gleich base

# Eingabe:
# base   Ganzzahl
# limit  Ganzzahl

# Ausgabe:
# Ein int Array mit allen Vielfachen von base bis limit

# Beispiele:
# base = 2, limit = 6 -> [2, 4, 6]
# base = 2, limit = 5 -> [2, 4]

# Lösungsansatz 1:
# Nutzung einer while Schleife
# Startwert ist base
# In jedem Schritt wird base addiert
# Werte werden in einer ArrayList gesammelt
# Danach Umwandlung in ein int Array

# Lösungsansatz 2:
# Nutzung von Java Streams
# rangeClosed von base bis limit
# Filter auf Vielfache von base
# Direkte Rückgabe als int Array

# Ich habe gelernt:
# wie man Vielfache effizient berechnet
# wie man ArrayList in Arrays umwandelt
# wie Streams eine kompakte Alternative zu Schleifen sein können
*/

import java.util.ArrayList;
import java.util.stream.IntStream;


public class Multiples {
    public static int[] find(int base, int limit) {
        ArrayList<Integer> numbers = new ArrayList<>();
int sum = base;
        while (sum<=limit){
            numbers.add(sum);
            sum+=base;

        }
        int [] myNumber = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            myNumber[i]=numbers.get(i);

        }

        return myNumber;
    }
    public static int[] findStream(int base, int limit){
        return IntStream.rangeClosed(base,limit).filter(x->x%base == 0).toArray();
    }
}