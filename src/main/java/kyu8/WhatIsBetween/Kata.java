package kyu8.WhatIsBetween;

import java.util.ArrayList;

public class Kata {

    public static int[] between(int a, int b) {
        if(a>b){
            throw new IllegalArgumentException("a must be smaller equal to b");
        }
        ArrayList<Integer> value = new ArrayList<>();
        for (int i = a;i<=b;i++){
            value.add(i);
        }
        return value.stream().mapToInt(i->i).toArray();
    }
}