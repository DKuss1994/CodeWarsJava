package kyu8.GrassHopper;
/*
# Grasshopper Grade book 8 kyu

# https://www.codewars.com/kata/55cbd4ba903825f7970000f5/train/java
# Sprache: Java
# Datum: 2025-12-06

# Aufgabe:
# Es soll die Durchschnittsnote aus drei Punkten bestimmt werden.
# Anhand des errechneten Durchschnitts muss anschließend ein Buchstabe
# als Note zurückgegeben werden.

# Punktebereich und Noten:
# 90 bis 100 = A
# 80 bis 89  = B
# 70 bis 79  = C
# 60 bis 69  = D
# darunter   = F

# Ich habe gelernt wie ich einen Durchschnitt berechne
# wie ich doppelte Vergleiche in Bedingungen korrekt formuliere
# wie ich Bereiche ohne Überschneidung prüfe
# und wie ich abhängig vom Ergebnis einen einzelnen Zeichenwert zurückgebe
*/

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        int sum = s1+s2+s3;
        int f = 60;
        int d = 70;
        int c = 80;
        int b = 90;
        int a = 100;
        char note = ' ';
        double average = (double) sum /3;
        if(0<= average &&average<f){
            note = 'F';
        } else if (f<= average&&average<d) {
            note = 'D';

        }
         else if (d<= average&&average<c) {
            note = 'C';


        } else if (c<= average&&average<b) {
            note = 'B';


        } else if (b<= average&&average<=a) {
            note = 'A';

        }
        return note;
    }
}