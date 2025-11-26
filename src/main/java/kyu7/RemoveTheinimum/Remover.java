package kyu7.RemoveTheinimum;

/*# Das Museum der unglaublich langweiligen Dinge (7 kyu)

# https://www.codewars.com/kata/563cf89eb4747c5fb100001b/train/java
        # Sprache: Java
# Datum: 2025-11-26

        # Aufgabe:
        # Das Museum der unglaublich langweiligen Dinge möchte einige Exponate entfernen.
        # Jedes Exponat bekommt eine Bewertung. Anschließend soll das Exponat mit der
        # niedrigsten Bewertung entfernt werden.
        #
        # Schreibe eine Funktion, die aus einer Liste von Ganzzahlen den kleinsten Wert entfernt.
        #
        # Bedingungen:
        # - Verändere das ursprüngliche Array nicht.
        # - Wenn mehrere Elemente denselben kleinsten Wert haben, entferne das mit dem
        #   niedrigsten Index.
        # - Wenn die Liste leer ist, gib eine leere Liste zurück.
        # - Die Reihenfolge der übrigen Elemente bleibt unverändert.

        # Beispiele:
        # [1,2,3,4,5] -> [2,3,4,5]
        # [5,3,2,1,4] -> [5,3,2,4]
        # [2,2,1,2,1] -> [2,2,2,1]

# Ich hab gelernt, wie man den kleinsten Wert in einer Liste findet,
# wie man ihn nur einmal anhand des Index entfernt
# und wie man dabei das Original nicht verändert.
*/

public class Remover {
    public static int[] removeSmallest(int[] numbers) {
        if(numbers == null){
            return numbers;
        } else if (numbers.length == 0) {
            return numbers;
        }

        int count = 0;
        int x = 0;
        int min = numbers[0];
        int[] newNumbers;
        newNumbers = new int[numbers.length-1];
        for(int number:numbers){
            if(number<min){
                min = number;
            }
        }
        for (int i = 0; i<numbers.length;i++){
            if (numbers[i]== min && count == 0){
                count ++;
            }
            else{
                newNumbers[x]=numbers [i];
                x++;
            }
        }

        return newNumbers;
    }
}
