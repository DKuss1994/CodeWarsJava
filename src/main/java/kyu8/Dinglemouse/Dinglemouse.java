package kyu8.Dinglemouse;
/*
# Cat Years, Dog Years (8 kyu)

# https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/java
# Sprache: Java
# Datum: 2025-12-08

# Aufgabe:
# Gegeben ist das Alter eines Menschen in Jahren.
# Berechne daraus das Alter einer Katze und eines Hundes in Tierjahren nach folgendem Schema:

# Katze:
# 15 Jahre für das erste Menschenjahr
# +9 Jahre für das zweite Menschenjahr
# +4 Jahre für jedes weitere Jahr

# Hund:
# 15 Jahre für das erste Menschenjahr
# +9 Jahre für das zweite Menschenjahr
# +5 Jahre für jedes weitere Jahr

# Rückgabe:
# Ein Array mit [humanYears, catYears, dogYears]

# Beispiel:
# Eingabe: 1  -> Ausgabe: [1, 15, 15]
# Eingabe: 2  -> Ausgabe: [2, 24, 24]
# Eingabe: 10 -> Ausgabe: [10, 56, 64]

# Ich habe gelernt wie man:
# - Schleifen und Bedingungen kombiniert um unterschiedliche Zuwächse für die ersten zwei Jahre und alle weiteren Jahre zu berechnen
# - alternative Lösungen mit switch/case erstellt
# - Arrays zurückgibt, die mehrere Werte enthalten
# - korrekte Berechnungen über mehrere Schritte hinweg überprüft
*/


public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int human = humanYears;
        int cat = 15;
        int dog = 15;
        if(humanYears>=2){
            cat+=9;
            dog+=9;
            }

            for (int i = 2; i < humanYears; i++) {
                cat += 4;
                dog += 5;

        }
        return new int[]{human, cat, dog};
    }


    public static int[] humanYearsCatYearsDogYearsSwitch(final int humanYears) {
        int dog = 0; int cat = 0;
        switch (humanYears){
            default:
                cat = 4*(humanYears-2);
                dog = 5*(humanYears-2);

            case 2:
                cat+= 9;
                dog+=9;
            case 1:
                cat += 15;
                dog += 15;
        }

        return new int[]{humanYears, cat, dog};
    }
}
