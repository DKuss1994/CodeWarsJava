package kyu7.ArithmeticFunction;

/*
# Arithmetic Function (7 kyu)

# https://www.codewars.com/kata/583f158ea20cfcbeb400000a/java
# Sprache: Java
# Datum: 2025-12-08

# Aufgabe:
# Schreibe eine Funktion, die zwei Zahlen und einen Operator-String erhält
# und das Ergebnis der entsprechenden arithmetischen Operation zurückgibt.
# Mögliche Operatoren sind: "add", "subtract", "multiply", "divide".

# Beispiele:
# 5, 2, "add"      -> 7
# 5, 2, "subtract" -> 3
# 5, 2, "multiply" -> 10
# 6, 2, "divide"   -> 3

# Ich habe gelernt wie man Strings vergleicht um eine Operation auszuwählen
# wie man if/else Bedingungen oder switch Statements für unterschiedliche Fälle nutzt
# wie man einfache mathematische Operationen mit Variablen durchführt
# und wie man Tests schreibt und überprüft dass die Ergebnisse korrekt sind
*/


class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        if (operator.equals("add")) {
            return a + b;
        } else if (operator.equals("subtract")) {
            return a - b;
        } else if (operator.equals("multiply")) {
            return a * b;

        } else if (operator.equals("divide")) {
            return a / b;

        }
        return 0;
    }

    public static int arithmeticSwitch(int a, int b, String operator) {
        switch (operator) {
            case "add":
                return a + b;

            case "subtract":
                return a - b;

            case "multiply":
                return a * b;

            case "divide":
                return a / b;


        }
        return a;
    }
}