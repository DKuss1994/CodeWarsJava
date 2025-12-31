package kyu8.WhatIsBetween;

import java.util.ArrayList;
import java.util.stream.IntStream;
/*# What is between? (7 kyu)

# https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java
# Sprache: Java
# Datum: 2025-12-XX

# Aufgabe:
# Schreibe eine Funktion, die zwei Ganzzahlen a und b entgegennimmt (a <= b)
# und ein Array aller Ganzzahlen zwischen diesen beiden Zahlen zurückgibt, inklusive a und b.
#
# Die Funktion soll:
# - prüfen, ob a kleiner oder gleich b ist
# - alle Zahlen zwischen a und b sammeln
# - die Zahlen als int Array zurückgeben
#
# Beispiel:
# Eingabe:  a = 1, b = 4
# Ausgabe:  [1, 2, 3, 4]
#
# Ich habe gelernt:
# - wie man Schleifen benutzt, um Zahlen zwischen zwei Grenzen zu sammeln
# - wie man Ausnahmen wirft, wenn die Eingabe ungültig ist
# - wie man ArrayLists in Arrays umwandelt
# - wie man Java Streams (IntStream.rangeClosed) für solche Aufgaben einsetzen
*/

public class Kata {

    public static int[] between(int a, int b) {
        extracted(a, b);
        ArrayList<Integer> value = new ArrayList<>();
        for (int i = a;i<=b;i++){
            value.add(i);
        }
        return value.stream().mapToInt(i->i).toArray();
    }

    private static void extracted(int a, int b) {
        if(a > b){
            throw new IllegalArgumentException("a must be smaller equal to b");
        }
    }

    public static int[] betweenStream(int a, int b){
        extracted(a,b);
        return IntStream.rangeClosed(a,b).toArray();
    }
}