package kyu7.SumOfTheFirstNthTermOfSeries;
/*# Sum of the First nth Term of Series (7 kyu)

# https://www.codewars.com/kata/555eded1ad94b00403000071
# Sprache: Java
# Datum: 28.01.2026

# Aufgabe:
# Berechne die Summe der ersten n Terme der gegebenen Zahlenreihe
# Die Reihe beginnt bei 1 und jeder weitere Term ist 1 geteilt durch eine Zahl
# Diese Zahl startet bei 4 und erhöht sich bei jedem Schritt um 3

# Zahlenreihe:
# n = 1 -> 1
# n = 2 -> 1 + 1/4
# n = 3 -> 1 + 1/4 + 1/7
# n = 4 -> 1 + 1/4 + 1/7 + 1/10
# usw.

# Anforderungen:
# Das Ergebnis muss auf zwei Nachkommastellen gerundet werden
# Der Rückgabewert muss ein String sein
# Bei n = 0 muss "0.00" zurückgegeben werden
# Es werden nur natürliche Zahlen übergeben

# Beispiele:
# 1 -> "1.00"
# 2 -> "1.25"
# 5 -> "1.57"
# 58 -> "2.40"

# Lösungsansatz:
# Spezialfälle für n = 0 und n = 1 behandeln
# Startwert der Summe ist 1
# Der Nenner beginnt bei 4
# In einer Schleife wird jeweils 1 durch den aktuellen Nenner addiert
# Der Nenner wird nach jedem Schritt um 3 erhöht
# Am Ende wird das Ergebnis mit DecimalFormat auf zwei Nachkommastellen formatiert

# Lernpunkte:
# Arbeiten mit Gleitkommazahlen
# Runden und Formatieren von Zahlen
# Umgang mit DecimalFormat und Locale
# Saubere Behandlung von Sonderfällen
# Schreiben von Unit Tests zur Absicherung
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NthSeriesTest {
    @Test
    void test0(){
        Assertions.assertEquals("0.00",NthSeries.seriesSum(0));
    }
    @Test
    void test1(){
        Assertions.assertEquals("1.00",NthSeries.seriesSum(1));
    }
    @Test
    void test5(){
        Assertions.assertEquals("1.57",NthSeries.seriesSum(5));
    }
    @Test
    void test58(){
        Assertions.assertEquals("2.40",NthSeries.seriesSum(58));
    }
}
