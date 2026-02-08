package kyu6.EnoughIsEnough;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnoughIsEnoughTest {
    @Test
    void testCase1(){
        int[]pic = {2,2,3};
        int[]picUpdate = {2,3};
        int maxCurrens = 1;

        Assertions.assertArrayEquals(picUpdate,EnoughIsEnough.deleteNth(pic,maxCurrens));
    }
    @Test
    void testCase2(){
        int[]pic = {2,2,3};
        int[]picUpdate = {2,2,3};
        int maxCurrens = 2;

        Assertions.assertArrayEquals(picUpdate,EnoughIsEnough.deleteNth(pic,maxCurrens));
    }
    @Test
    void testCase3(){
        int[]pic = {2,2,3};
        int[]picUpdate = {};
        int maxCurrens = 0;

        Assertions.assertArrayEquals(picUpdate,EnoughIsEnough.deleteNth(pic,maxCurrens));
    }
}
