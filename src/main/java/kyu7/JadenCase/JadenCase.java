package kyu7.JadenCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class JadenCase {
    // hello world
    public String toJadenCase(String phrase) {
        String[] jaden ;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = new StringBuilder();
        int count = 1;

        if (phrase.isEmpty()) {
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





