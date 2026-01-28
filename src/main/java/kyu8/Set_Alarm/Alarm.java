package kyu8.Set_Alarm;
/*# L1 Set Alarm (8 kyu)

# https://www.codewars.com/kata/568dcc3c7f12767a62000038
# Sprache: Java
# Datum: 28.01.2026

# Aufgabe:
# Schreibe eine Funktion die entscheidet ob ein Wecker gestellt werden soll
# Es gibt zwei Bedingungen
# Ob man arbeitet
# Ob man im Urlaub ist

# Logik:
# Der Wecker soll nur dann gestellt werden
# Wenn man arbeitet
# Und gleichzeitig nicht im Urlaub ist

# Wahrheitstabelle:
# employed true vacation true  -> false
# employed true vacation false -> true
# employed false vacation true -> false
# employed false vacation false -> false

# Lösungsansatz:
# Nutzung eines logischen UND Operators
# Zusätzliches Negieren des Urlaubsstatus
# Rückgabe des direkten booleschen Ausdrucks ohne zusätzliche if Abfragen

# Code:
# return employed && !vacation;

# Lernpunkte:
# Sicherer Umgang mit boolescher Logik
# Verständnis von logischen Operatoren
# Reduktion von Code auf eine klare und lesbare Aussage
# Schreiben präziser Unit Tests
*/

public class Alarm {

    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }

}
