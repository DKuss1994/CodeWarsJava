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
    @Test
    void testCase3(){
        int[] value = {5};
        int a = 5;
        int b = 5;
        Assertions.assertArrayEquals(value,Kata.between(a,b));
    }
    @Test
    void testCase4(){
        int[] value = {-2,-1,0,1,2,3,4};
        int a = -2;
        int b = -4;

        IllegalArgumentException thrown = Assertions.assertThrowsExactly(IllegalArgumentException.class,()-> Kata.between(a,b));
        Assertions.assertEquals("a must be smaller equal to b",thrown.getMessage());

    }

    @Test
    void testCaseStream(){
        int[] value = {1,2,3,4};
        int a = 1;
        int b = 4;
        Assertions.assertArrayEquals(value,Kata.betweenStream(a,b));
    }
    @Test
    void testCaseStream2(){
        int[] value = {-2,-1,0,1,2,3,4};
        int a = -2;
        int b = 4;
        Assertions.assertArrayEquals(value,Kata.betweenStream(a,b));
    }
    @Test
    void testCaseStream3(){
        int[] value = {5};
        int a = 5;
        int b = 5;
        Assertions.assertArrayEquals(value,Kata.betweenStream(a,b));
    }
    @Test
    void testCaseStream4(){
        int[] value = {-2,-1,0,1,2,3,4};
        int a = -2;
        int b = -4;

        IllegalArgumentException thrown = Assertions.assertThrowsExactly(IllegalArgumentException.class,()-> Kata.betweenStream(a,b));
        Assertions.assertEquals("a must be smaller equal to b",thrown.getMessage());

    }
}