package kyu6.EnoughIsEnough;
/*# Enough is enough (6 kyu)

# https://www.codewars.com/kata/554ca54ffa7d91b236000023
# Sprache: Java
# Datum: 08.02.2026

# Aufgabe:
# Aus einer Zahlenliste sollen doppelte Werte entfernt werden
# Jedes Element darf höchstens N mal vorkommen
# Die ursprüngliche Reihenfolge muss erhalten bleiben

# Hintergrund:
# Charlie möchte sich keine gleichen Motive zu oft ansehen
# Deshalb sollen wiederholte Werte begrenzt werden

# Beispiele:
# [1,2,3,1,2,1,2,3], N = 2 -> [1,2,3,1,2,3]
# [20,37,20,21], N = 1 -> [20,37,21]
# N = 0 -> []

# Lösungsansatz:
# Zuerst alle Elemente in eine dynamische Liste kopieren
# Für jedes Element zählen wie oft es vorkommt
# Sobald die Anzahl größer als erlaubt ist, wird es entfernt
# Am Ende Rückumwandlung in ein int Array

# Wichtige Punkte:
# Reihenfolge darf sich nicht ändern
# Entfernen während Iteration erfordert vorsichtiges Vorgehen
# Zählen pro Element mit verschachtelter Schleife

# Lernpunkte:
# Arbeiten mit ArrayList statt festen Arrays
# Elemente gezielt aus Listen entfernen
# Verständnis für Zählmechanismen und Häufigkeiten
# Umgang mit verschachtelten Schleifen
# Konvertierung zwischen List und Array
# Bewusstsein für Laufzeit O(n²) und mögliche Optimierung mit Map
*/

import java.util.ArrayList;


public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        int[] zero =new  int[0];
        if(maxOccurrences < 0){
            return zero;
        }
        ArrayList<Integer> listElements = new ArrayList<>();
        int count;
        for (int element : elements) {
            listElements.add(element);
        }
        for (int i = 0; i < listElements.size(); i++) {
            count = 0;
            for (int i1 = 0; i1 < listElements.size(); i1++) {

                if(listElements.get(i).equals(listElements.get(i1))){
                    count++;
                    if(count>maxOccurrences){
                        listElements.remove(i1);
                    }
                }
            }
        }
        int[]newElements;
        newElements = new int[listElements.size()];
        for (int i = 0; i < newElements.length; i++) {
            newElements[i] = listElements.get(i);
        }
        return newElements;
    }


}
