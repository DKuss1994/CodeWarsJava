package kyu8.Goals;
/*# Grasshopper Messi Goals (8 kyu)

# https://www.codewars.com/kata/55ca77fa094a2af31f00002a
# Sprache: Java
# Datum: 08.02.2026

# Aufgabe:
# Speichere die Anzahl der geschossenen Tore von Messi
# Es gibt drei Wettbewerbe
# Am Ende soll die Gesamtanzahl automatisch berechnet werden

# Gegeben:
# La Liga = 43
# Champions League = 10
# Copa del Rey = 5

# Erwartet:
# Eine Variable totalGoals mit der Summe aller Tore

# Lösungsansatz:
# Nutzung von Konstanten mit final static
# Jede Toranzahl wird als eigene Variable gespeichert
# Die Gesamtsumme wird direkt als Addition berechnet
# Keine Methode notwendig, nur Variablen

# Code Idee:
# totalGoals = laLigaGoals + championsLeagueGoals + copaDelReyGoals

# Lernpunkte:
# Arbeiten mit Konstanten final static
# Saubere Benennung von Variablen
# Grundlagen von Klassenvariablen
# Einfache Berechnungen ohne Logik oder Schleifen
# Verständnis für Compilezeit Konstanten
*/

class Goals {
    final public static int laLigaGoals = 43;
    final public static int championsLeagueGoals = 10;
    final public static int copaDelReyGoals = 5;

    final public static int totalGoals = laLigaGoals+championsLeagueGoals+copaDelReyGoals;
}