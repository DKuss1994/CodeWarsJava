package kyu8.YesOrNo;

/*
# Convert boolean values to strings Yes or No (8 kyu)

# https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java
# Sprache Java
# Datum 2025 12 08

# Aufgabe
# Schreibe eine Funktion die einen boolean Wert entgegen nimmt und
# bei true den Text Yes zurückgibt
# bei false den Text No zurückgibt

# Hinweise
# Die Methode soll eine einfache Entscheidung treffen
# Optional kann die Lösung auch mit einem ternären Operator umgesetzt werden

# Beispiel
# Eingabe  true   Ausgabe  Yes
# Eingabe  false  Ausgabe  No

# Ich habe gelernt wie man
# einfache Entscheidungen mit if und else formuliert
# boolean Werte direkt auswertet
# mit dem ternären Operator eine kompakte Alternative schreibt
*/


class YesOrNo
{

    public static String boolToWord(boolean b) {
        // We check the parameter and return yes or no-
        if(b){
            return "Yes";
        }
        else {
            return "No";
        }
    }
    public static String boolToWordLambda(boolean b){
        String no = "no";
        String yes = "Yes";
        return b ? yes : no;
    }

}
