package kyu8.StringToNumber;
/*# Convert a String to a Number! (8 kyu)

# https://www.codewars.com/kata/544675c6f971f7399a000e79
# Sprache: Java
# Datum: 12.01.2026

# Aufgabe:
# Erstelle eine Funktion, die einen String in eine Ganzzahl umwandelt.
# Jeder übergebene String stellt immer eine gültige Ganzzahl dar.
# Es können sowohl positive als auch negative Zahlen vorkommen.

# Eingabe:
# Ein String, der eine Ganzzahl repräsentiert

# Ausgabe:
# Eine Integer Zahl mit dem entsprechenden numerischen Wert

# Beispiele:
# "1234" -> 1234
# "605" -> 605
# "1405" -> 1405
# "-7" -> -7

# Regeln:
# Der Input ist immer ein String
# Der String ist immer eine gültige Darstellung einer Ganzzahl
# Es müssen keine Fehlerfälle abgefangen werden

# Lösungsansatz:
# Nutzung der Standard Java Methode zur Umwandlung von Strings in Integer
# Dadurch wird der Code kurz, klar und zuverlässig

# Ich habe gelernt:
# wie String zu Integer Konvertierung in Java funktioniert
# warum Standardbibliotheken oft die beste Lösung sind
# wie man einfache Aufgaben sauber und lesbar löst
*/
public class StringToNumber {
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}