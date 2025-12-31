package kyu8.WhatIsBetween;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Kata {

    public static int[] between(int a, int b) {
        extracted(a, b);
        ArrayList<Integer> value = new ArrayList<>();
        for (int i = a;i<=b;i++){
            value.add(i);
        }
        return value.stream().mapToInt(i->i).toArray();
    }

    private static void extracted(int a, int b) {
        if(a > b){
            throw new IllegalArgumentException("a must be smaller equal to b");
        }
    }

    public static int[] betweenStream(int a, int b){
        extracted(a,b);
        return IntStream.rangeClosed(a,b).toArray();
    }
}