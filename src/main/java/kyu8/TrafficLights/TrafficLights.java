package kyu8.TrafficLights;
/*# Thinkful – Logikübung: Ampel (8 kyu)

# https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java
        # Sprache: Java
# Datum: 2025-11-28

        # Aufgabe:
        # Du schreibst eine Funktion für die Ampelsteuerung deiner Stadt.
        # Die Funktion bekommt den aktuellen Zustand der Ampel als String
        # und soll zurückgeben, in welchen Zustand die Ampel als Nächstes wechselt.
        #
        # Die Reihenfolge lautet:
        # grün -> gelb -> rot -> grün

        # Beispiel:
        # updateLight("green")  -> "yellow"
        # updateLight("yellow") -> "red"
        # updateLight("red")    -> "green"

# Ich habe gelernt, wie man mehrere Zustände mit if/else sauber abfragt
# und wie man eine feste Reihenfolge logisch abbildet,
# sodass die Funktion immer den nächsten passenden Zustand zurückgibt.
*/

public class TrafficLights {

    public static String updateLight(String current) {
        String updateLight = "";
        if (current.equals("green")) {
            updateLight = "yellow";
        } else if (current.equals("yellow")) {
            updateLight = "red";
        } else if (current.equals("red")) {
            updateLight = "green";
        }
        return updateLight;
    }
}



