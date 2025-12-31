package kyu8.WhatIsBetween;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {

    @Test
    void testCase(){
        int[] value = {1,2,3,4};
        int a = 1;
        int b = 4;
        Assertions.assertArrayEquals(value,Kata.between(a,b));
    }
    @Test
    void testCase2(){
        int[] value = {-2,-1,0,1,2,3,4};
        int a = -2;
        int b = 4;
        Assertions.assertArrayEquals(value,Kata.between(a,b));
    }
}