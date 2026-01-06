package kyu7.Money;
/*# Money, Money, Money (7 kyu)

# https://www.codewars.com/kata/563f037412e5ada593000114
# Sprache: Java
# Datum: 06.01.2026

# Aufgabe:
# Berechne wie viele Jahre benötigt werden, bis ein Startkapital
# durch jährliche Verzinsung und Besteuerung einen Zielbetrag erreicht.
#
# Dabei gilt:
# Zinsen werden jedes Jahr berechnet
# Steuern werden nur auf die erwirtschafteten Zinsen gezahlt
# Der verbleibende Zinsertrag wird erneut investiert
#
# Sonderfall:
# Ist das Startkapital bereits gleich dem Zielbetrag
# muss 0 Jahre zurückgegeben werden
#
# Beispiel:
# Startkapital: 1000
# Zinssatz: 0.05
# Steuer: 0.18
# Zielbetrag: 1100
#
# Ergebnis:
# 3 Jahre
#
# Lösungsansatz:
# Verwendung einer while Schleife
# Jährliche Berechnung der Nettorendite
# Aufaddieren der Zinsen zum Kapital
# Zählen der benötigten Jahre
#
# Tests:
# Normalfall mit mehreren Jahren Laufzeit
# Sonderfall bei gleichem Start und Zielkapital
# Langfristige Berechnung mit kleinem Zinssatz
#
# Ich habe gelernt:
# wie man finanzielle Berechnungen sauber umsetzt
# wie Schleifen Zustände über Zeit verändern
# wie man mit double Werten korrekt arbeitet
# wie wichtig klare Abbruchbedingungen sind
# wie Unit Tests auch Randfälle absichern
*/

public class Money {
    public static int calculateYears(double principal, double interest,
                                     double tax, double desired) {
        double zins;
        int years = 0;
        if (principal == desired||principal>desired) {
            return years;
        }

        while (principal<desired){
            zins = (principal*interest)*(1-tax);
            principal+=zins;
            years++;
        }

        return years;
    }
}