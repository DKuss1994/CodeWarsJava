package kyu8.HelpAlex;
/*# Keep up the hoop (8 kyu)

# https://www.codewars.com/kata/55cb632c1a5d7b3ad0000145
# Sprache: Java
# Datum: 04.02.2026

# Aufgabe:
# Alex zählt wie oft sich sein Hula Hoop dreht
# Abhängig von der Anzahl soll eine motivierende Nachricht zurückgegeben werden
#
# Bedingung:
# 10 oder mehr -> positive Erfolgsnachricht
# weniger als 10 -> weiter üben

# Beispiele:
# 3  -> "Keep at it until you get it"
# 10 -> "Great, now move on to tricks"
# 25 -> "Great, now move on to tricks"

# Lösungsansatz:
# Einfache Vergleichslogik mit einer Schwelle von 10
# Nutzung einer if Abfrage oder alternativ eines ternären Operators
# Direkte Rückgabe der passenden Nachricht ohne zusätzliche Variablen

# Code Ideen:
# if (n >= 10) return "...";
# oder
# return n < 10 ? "..." : "...";

# Lernpunkte:
# Arbeiten mit Bedingungen und Vergleichsoperatoren
# Verständnis von >= und <
# Einsatz des ternären Operators für kompakteren Code
# Schreiben klarer und lesbarer Business Logik
# Erkennen wann einfache Logik ohne Schleifen ausreicht
*/

public class HelpAlex {
    public static String hoopCount(int n) {
        int value = 10;
        if (n >= value) {
            return "Great, now move on to tricks";

        }
        return "Keep at it until you get it";
    }

    public static String hoopCountLambda(int n) {
        return n < 10 ? "Keep at it until you get it" : "Great, now move on to tricks";
    }
}