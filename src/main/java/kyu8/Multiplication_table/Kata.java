package kyu8.Multiplication_table;
/*# Multiplication table for number (8 kyu)

# https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce
# Sprache: Java
# Datum: 12.01.2026

# Aufgabe:
# Schreibe eine Funktion, die für eine Zahl von 1 bis 10
# eine komplette Einmaleins Tabelle als String zurückgibt

# Die Tabelle soll von 1 bis 10 gehen
# Jede Zeile folgt dem Format:
# i * num = ergebnis

# Wichtig:
# Zeilen werden durch Zeilenumbrüche getrennt
# Am Ende darf kein zusätzlicher Zeilenumbruch stehen

# Eingabe:
# num   Ganzzahl zwischen 1 und 10

# Ausgabe:
# Ein String mit der vollständigen Multiplikationstabelle

# Beispiel für num = 5:
# 1 * 5 = 5
# 2 * 5 = 10
# ...
# 10 * 5 = 50

# Lösungsansatz 1:
# Nutzung eines StringBuilders
# Schleife von 1 bis 10
# Nach jeder Zeile wird ein Zeilenumbruch hinzugefügt
# Beim letzten Durchlauf wird kein Umbruch mehr ergänzt

# Lösungsansatz 2:
# Nutzung eines StringBuilders mit festem Zeilenumbruch
# Nach der Schleife wird der letzte Umbruch mit trim entfernt
# Dadurch entsteht kein trailing newline

# Ich habe gelernt:
# wie man formatierte Strings zusammensetzt
# wie man StringBuilder effizient nutzt
# warum sauberes Zeilenhandling wichtig für Tests ist
*/

class Kata {
    public static String multiTable(int num) {
        StringBuilder x = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            x.append(i).append(" * ").append(num).append(" = ").append(i * num);
            if(i==10){
                break;
            }
            x.append(System.lineSeparator());

        }
        return x.toString();
    }
    public static String multiTable2(int num){
        StringBuilder stringBuilder = new StringBuilder();
        int result;
        for (int i = 1; i <= 10; i++) {
            result=i*num;
            stringBuilder.append(i).append(" * ").append(num).append(" = ").append(result).append("\n");
        }

        return stringBuilder.toString().trim();
    }
}