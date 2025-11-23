package kyu8.Banjo;

/*# Are You Playing Banjo? (8 kyu)

# https://www.codewars.com/kata/53af2b8861023f1d88000832/java
        # Sprache: Java
# Datum: 2025-11-21

        # Task: Create a function which answers the question "Are you playing banjo?".
        # If a name starts with the letter "R" or lowercase "r", the person is playing banjo.
        # The function takes a name as its only argument, and returns one of the following strings:
        # - name + " plays banjo"
        # - name + " does not play banjo"
        # Names given are always valid strings.

        # Examples:
        # "Adam" -> "Adam does not play banjo"
        # "Ringo" -> "Ringo plays banjo"
        # "rolf" -> "rolf plays banjo"
        # "bravo" -> "bravo does not play banjo"

# Ich hab gelernt, wie man Strings überprüft, ob sie mit einem bestimmten Buchstaben beginnen, und darauf basierend unterschiedliche Ausgaben erzeugt.
*/
public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        String namelow = name.toLowerCase();
        char first = namelow.charAt(0);
        char search = 'r';

        if (first == search ){
            return name + " plays banjo";
        }
        else{
            return name+ " does not play banjo";
        }

    }

}
