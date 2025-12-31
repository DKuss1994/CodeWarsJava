package kyu8.WhatIsBetween;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {

    public static int[] between(int a, int b) {
        ArrayList<Integer> value = new ArrayList<>();
        for (int i = a;i<=b;i++){
            value.add(i);
        }
        return value.stream().mapToInt(i->i).toArray();
    }
}