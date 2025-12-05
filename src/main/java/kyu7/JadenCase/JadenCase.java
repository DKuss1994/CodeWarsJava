package kyu7.JadenCase;
import java.util.Locale;

/*# Jaden Casing Strings (7 kyu)

# https://www.codewars.com/kata/5390bac347d09b7da40006f6/java
        # Sprache: Java
# Datum: 2025-11-21

        # Aufgabe:
        # Schreibe eine Funktion, die einen gesamten Satz so umwandelt,
        # dass jedes einzelne Wort mit einem Großbuchstaben beginnt.
        #
        # Die Funktion soll:
        # - jedes Wort erkennen
        # - den ersten Buchstaben groß machen
        # - den Rest des Wortes unverändert lassen
        #
        # Besonderheit:
        # In Java soll die Funktion null zurückgeben,
        # wenn der übergebene String leer oder selbst null ist.

        # Beispiel:
        # Eingabe:  "How can mirrors be real if our eyes aren't real"
        # Ausgabe:  "How Can Mirrors Be Real If Our Eyes Aren't Real"

# Ich habe gelernt, wie man Strings korrekt aufteilt,
# wie man jedes Wort einzeln verändert
# und wie man Sonderfälle wie null oder leere Eingaben sauber behandelt.
*/


public class JadenCase {
    public String toJadenCase(String phrase) {
        String[] jaden ;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = new StringBuilder();
        int count = 1;

        if (phrase == null) {
            return null;
        } else if (phrase.isEmpty()) {
            return null;

        } else {
            jaden = phrase.split(" ");
            for (String s : jaden) {
                stringBuilder.append(s.substring(0,1).toUpperCase(Locale.ROOT));
                stringBuilder.append(s.substring(1));
                if(count < jaden.length){
                    stringBuilder.append(" ");
                    count++;
                }

                }

            }
           return String.valueOf(stringBuilder);
            }

}





