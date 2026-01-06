package kyu6.BuildTower;
/*# Build Tower (6 kyu)

# https://www.codewars.com/kata/576757b1df89ecf5bd00073b
# Sprache: Java
# Datum: 06.01.2026

# Aufgabe:
# Erstelle einen Turm in Pyramidenform aus Sternchen.
# Die Höhe des Turms wird über die Anzahl der Etagen festgelegt.
# Jede Etage wird als String dargestellt und alle Etagen
# werden in einem String Array zurückgegeben.
#
# Regeln:
# Die Anzahl der Etagen ist eine positive Ganzzahl
# Jede Etage ist zentriert
# Die unterste Etage ist die breiteste
# Ein Sternchen stellt einen Turmblock dar
# Bei negativen Etagenzahlen wird eine Exception geworfen
#
# Beispiel:
# Eingabe: 3
# Ergebnis:
# [
#   "  *  ",
#   " *** ",
#   "*****"
# ]
#
# Eingabe: 1
# Ergebnis:
# [
#   "*"
# ]
#
# Lösungsansatz:
# Berechnung der maximalen Breite des Turms
# Aufbau von oben nach unten
# Pro Etage werden:
# passende Leerzeichen links und rechts erzeugt
# die benötigte Anzahl an Sternchen berechnet
# alles zu einem String zusammengesetzt
#
# Tests:
# Standardfall mit mehreren Etagen
# Sonderfall mit nur einer Etage
# Fehlerfall bei negativer Etagenzahl
#
# Ich habe gelernt:
# wie man Strings dynamisch mit repeat erstellt
# wie man symmetrische Strukturen berechnet
# wie Schleifen rückwärts genutzt werden können
# wie man Exceptions gezielt einsetzt
# wie man Randfälle sinnvoll testet
*/

public class Kata {
    public static String[] towerBuilder(int nFloors) throws ArithmeticException {
        if (nFloors < 0) {
            throw new ArithmeticException("Floors do not under 0");
        }
        int width = 1;
        int space = 0;
        String[] build = new String[nFloors];
        for (int i = 0; i < nFloors - 1; i++) {
            width += 2;
        }
        for (int floors = nFloors - 1; floors >= 0; floors--) {
            build[floors] = " ".repeat(space) + "*".repeat(width) + " ".repeat(space);
            width -= 2;
            space++;
        }

        return build;
    }

}