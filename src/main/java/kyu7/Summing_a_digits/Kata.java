package kyu7.Summing_a_digits;
/*# Summing a number's digits (7 kyu)

# https://www.codewars.com/kata/52f3149496de55aded000410
# Sprache: Java
# Datum: 15.01.2026

# Aufgabe:
# Schreibe eine Funktion, die eine ganze Zahl als Eingabe nimmt
# und die Summe aller Ziffern des absoluten Wertes der Zahl zurückgibt

# Bedingungen:
# Die Eingabe ist immer eine ganze Zahl (Integer)
# Negative Zahlen sollen als positive behandelt werden
# Keine Dezimalstellen, nur Ziffern

# Beispiele:
# 10  --> 1  (1 + 0)
# 99  --> 18 (9 + 9)
# -32 --> 5  (3 + 2)

# Lösungsansatz 1:
# Zahl in String konvertieren
# Jeden Charakter durchlaufen
# Zeichen '-' überspringen
# Jeden Zifferncharakter in Integer umwandeln und aufsummieren
# Summe zurückgeben

# Lernpunkte:
# Umgang mit negativen Zahlen und String-Repräsentation
# Iteration über ein Char-Array
# Umwandlung von Zeichen in Zahlen
# Sauberes Handling von Sonderzeichen wie '-'
*/

public class Kata{
    public static int sumDigits(int number){
        String x = Integer.toString(number);
        char[] charArray = x.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]== '-'){
                continue;
            }
            sum+=Integer.parseInt( String.valueOf(charArray[i]));
        }

        return sum;
    }
}
