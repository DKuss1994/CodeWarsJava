package kyu8.Plural;
/*
# Plural (8 kyu)

# Sprache: Java
# Datum: 2025-12-18
https://www.codewars.com/kata/52ceafd1f235ce81aa00073a/train/java

# Aufgabe:
# Es soll entschieden werden, ob für eine Zahl die Mehrzahl verwendet werden muss.
# In der englischen Grammatik gilt:
# Nur genau 1 ist Singular.
# Alles andere inklusive 0 und Dezimalzahlen ist Plural.

# Beispiel:
# 1   -> false
# 0   -> true
# 1.5 -> true
# 10  -> true

# Lösung:
# Die Methode prüft einfach, ob der übergebene Wert ungleich 1 ist.
# Ist der Wert nicht exakt 1, wird true zurückgegeben.
# Dadurch sind alle Pluralfälle automatisch abgedeckt.

# Warum das funktioniert:
# Float Werte wie 1.0 sind gleich 1.
# Jeder andere positive oder negative Wert ist ungleich 1.

# Ich habe gelernt:
# dass einfache Bedingungen oft die beste Lösung sind
# dass man englische Grammatikregeln direkt in Code übersetzen kann
# dass man bei Aufgaben genau auf die Definition von Singular achten muss
# dass saubere Tests helfen Logikfehler zu vermeiden
*/

public class Plural{
    public static boolean isPlural(float f){
        return f!=1;
    }
}
