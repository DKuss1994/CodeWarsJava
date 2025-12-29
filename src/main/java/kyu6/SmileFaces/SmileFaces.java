package kyu6.SmileFaces;

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String s : arr) {
            char[] smile = s.toCharArray();
            if (smile.length == 2) {
                if (smile[0] == ':' || smile[0] == ';') {
                    if (smile[1] == ')' || smile[1] == 'D') {
                        count++;
                    }
                }
            } else if (smile.length == 3) {
                if (smile[0] == ':' || smile[0] == ';') {
                    if (smile[1] == '-' || smile[1] == '~') {
                        if (smile[2] == 'D' || smile[2] == ')') {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}

// : or ;    - or ~  ) or D