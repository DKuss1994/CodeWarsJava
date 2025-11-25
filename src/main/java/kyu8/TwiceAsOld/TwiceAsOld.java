package kyu8.TwiceAsOld;
/*# Twice as old (8 kyu)

# https://www.codewars.com/kata/5b853229cfde412a470000d0/train/java
        # Sprache: Java
# Datum: 2025-11-21

        # Aufgabe:
        # Deine Funktion erhält zwei Argumente:
        # - aktuelles Alter des Vaters (in Jahren)
        # - aktuelles Alter des Sohnes (in Jahren)
        #
        # Berechne, vor wie vielen Jahren der Vater doppelt so alt war wie sein Sohn
        # oder in wie vielen Jahren er doppelt so alt sein wird.
        # Die Antwort ist immer größer oder gleich 0, egal ob in der Vergangenheit oder Zukunft.

        # Beispiele:
        # (36, 7) -> 22  // 36-22 = 14, 7+22 = 29, 14 != 2*7, aber richtig: 36-2*7 = 22
        # (55, 30) -> 5
        # (42, 21) -> 0

# Ich hab gelernt, wie man das Alter von zwei Personen vergleicht
# und den Unterschied berechnet, sodass man die doppelte Altersrelation ermittelt.
*/
public class TwiceAsOld {
    public static int twiceAsOld(int dadYears, int sonYears) {
        int value;
        value = dadYears - 2*sonYears;
        if (value<0){
            return value * -1;
        }
        else{
            return value;
        }

    }
}