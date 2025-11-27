package kyu7.Printer;

import java.util.ArrayList;


public class Printer {

    public static String printerError(String s) {
        int counterError = 0;
        ArrayList<Character> druckerFarbe = new ArrayList<>();
        druckerFarbe.add('a');
        druckerFarbe.add('b');
        druckerFarbe.add('c');
        druckerFarbe.add('d');
        druckerFarbe.add('e');
        druckerFarbe.add('f');
        druckerFarbe.add('g');
        druckerFarbe.add('h');
        druckerFarbe.add('i');
        druckerFarbe.add('j');
        druckerFarbe.add('k');
        druckerFarbe.add('l');
        druckerFarbe.add('m');

        for (int i = 0; i < s.length(); i++) {
            if (!druckerFarbe.contains(s.charAt(i))) {
                counterError++;

            }
        }


        return counterError + "/" + s.length();

    }
}