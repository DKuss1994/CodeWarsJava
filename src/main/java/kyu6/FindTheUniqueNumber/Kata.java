package kyu6.FindTheUniqueNumber;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/*# Find the Unique Number (6 kyu)

# https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
# Sprache: Java
# Datum: 2025-12-27

# Aufgabe:
# Gegeben ist ein Array von Zahlen, bei dem alle Zahlen gleich sind,
# bis auf eine einzelne Zahl, die sich unterscheidet.
# Gesucht ist diese einzigartige Zahl.

# Die Funktion soll:
# - das Array analysieren
# - die Zahl identifizieren, die nur einmal vorkommt
# - die gefundene Zahl zurückgeben

# Besonderheiten:
# - Das Array enthält mindestens 3 Zahlen
# - Es kann sehr große Arrays geben, daher sollte die Lösung performant sein
# - Lösungen können klassische Schleifen, Sortierung oder Stream-Methoden verwenden

# Beispiele:
# Eingabe:  {1, 1, 1, 2, 1, 1}
# Ausgabe:  2.0
# Eingabe:  {0, 0, 0.55, 0, 0}
# Ausgabe:  0.55

# Ich habe gelernt:
# - wie man Elemente in einem Array zählt und vergleicht
# - wie man HashMaps für schnelle Zählungen nutzen kann
# - wie man über Streams und Lambdas das Problem elegant löst
# - wie Sortierung helfen kann, das einzigartige Element zu erkennen
# - wie man mehrere Lösungsansätze nebeneinander implementiert und testet
*/

public class Kata {
    public static double findUniq(double arr []) {
        Map<Double,Integer> counts = new HashMap<>();
        for (double v : arr) {
            counts.put(v,counts.getOrDefault(v,0)+1);
        }
        for(Map.Entry<Double,Integer> entry:counts.entrySet()){
            if(entry.getValue()== 1){
                return entry.getKey();
            }
        }
return 0.0;
    }
    public static double findUniqLamba(double arr[]){
        Arrays.sort(arr);
        return arr[0] == arr[1]?arr[arr.length-1]:arr[0];
    }
    public static double findUniqStream(double arr[]){
        return Arrays.stream(arr).boxed().collect(groupingBy(identity(),counting())).entrySet()
                .stream().filter(e->e.getValue()==1).findFirst()
                .map(Entry::getKey).orElse(0.0);
    }

}
