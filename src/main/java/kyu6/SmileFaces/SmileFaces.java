package kyu6.SmileFaces;

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String s : arr) {
            char [] smile = s.toCharArray();
            if (smile[0]==':' ||smile[0]== ';' ){
                if (smile[1]=='-' ||smile[1]== '~' ){
                    if(smile[2]=='D' ||smile[2]== ')' ){
                        count++;
                    }
                } else if (smile[1]==')' ||smile[1]== 'D' ) {
                    count++;
                }
            }
        }
        return count;
    }
}

// : or ;    - or ~  ) or D