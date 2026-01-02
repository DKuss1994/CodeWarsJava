package kyu6.AreSame;

import java.util.Arrays;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if(a==null||b==null){
            return false;
        }
        if (a.length == 0 && b.length == 0) {
            return true;
        }

        if (a.length != b.length) {
            return false;
            } else {
            return Arrays.equals(Arrays.stream(a).map(n->n*n).sorted().toArray(),Arrays
                    .stream(b).sorted().toArray());

        }

    }
}