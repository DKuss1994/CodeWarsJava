package kyu8.Welcome;

import java.util.HashMap;
import java.util.Map;
/*# Welcome! (8 kyu)

# https://www.codewars.com/kata/577ff15ad648a14b780000e7
# Sprache: Java
# Datum: 06.01.2026

# Aufgabe:
# Erstelle eine Funktion, die Besucher einer Webseite
# abhängig von ihrer Sprache begrüßt.
# Die Sprache wird als String übergeben und
# die passende Begrüßung aus einer internen Datenbank zurückgegeben.
#
# Regeln:
# Ist die Sprache in der Datenbank vorhanden
# wird die entsprechende Begrüßung zurückgegeben
# Ist die Sprache unbekannt oder ungültig
# wird standardmäßig die englische Begrüßung verwendet
#
# Unterstützte Sprachen:
# english, czech, danish, dutch, estonian, finnish, flemish,
# french, german, irish, italian, latvian, lithuanian,
# polish, spanish, swedish, welsh
#
# Beispiel:
# Eingabe: "german"
# Ausgabe: "Willkommen"
#
# Eingabe: "unknown"
# Ausgabe: "Welcome"
#
# Lösungsansatz:
# Verwendung einer HashMap als einfache Datenbank
# Speicherung der Sprachcodes als Schlüssel
# und der Begrüßungen als Werte
# Abfrage über containsKey und get
# Fallback auf englische Begrüßung bei unbekannter Eingabe
#
# Ich habe gelernt:
# wie man HashMaps sinnvoll als Lookup Tabelle nutzt
# wie man Default Werte sauber behandelt
# wie man einfache APIs robust gegen ungültige Eingaben macht
# wie man Code übersichtlich und erweiterbar strukturiert
*/

public class Welcome {
    public static String greet(String language) {
        Map<String, String> welcomeMap = new HashMap<>();
        welcomeMap.put("english", "Welcome");
        welcomeMap.put("czech", "Vitejte");
        welcomeMap.put("danish", "Velkomst");
        welcomeMap.put("dutch", "Welkom");
        welcomeMap.put("estonian", "Tere tulemast");
        welcomeMap.put("finnish", "Tervetuloa");
        welcomeMap.put("flemish", "Welgekomen");
        welcomeMap.put("french", "Bienvenue");
        welcomeMap.put("german", "Willkommen");
        welcomeMap.put("irish", "Failte");
        welcomeMap.put("italian", "Benvenuto");
        welcomeMap.put("latvian", "Gaidits");
        welcomeMap.put("lithuanian", "Laukiamas");
        welcomeMap.put("polish", "Witamy");
        welcomeMap.put("spanish", "Bienvenido");
        welcomeMap.put("swedish", "Valkommen");
        welcomeMap.put("welsh", "Croeso");
        if (welcomeMap.containsKey(language)) {
            return welcomeMap.get(language);
        } else {
            return "Welcome";
        }

    }
}