package kyu6.ArrayDiff;

import kyu6.Kata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class KataTest {
    @Test
    void TestCase1(){

        int []a= {1,2,3};
        int []b ={2};
        int[]value = {1,3};
        Assertions.assertArrayEquals(Kata.arrayDiff(a,b), value);
    }
    @Test
    void TestCase3(){

        int []a= {1, 2, 2, 2, 3};
        int []b ={2};
        int[]value = {1,3};
        Assertions.assertArrayEquals(Kata.arrayDiff(a,b), value);
    }
    @Test
    void TestCase(){

        int []a= {1,2,3};
        int []b ={};
        int[]value = {1,2,3};
        Assertions.assertArrayEquals(Kata.arrayDiff(a,b), value);
    }
    @Test
    void TestCaseSteam1(){

        int []a= {1,2,3};
        int []b ={2};
        int[]value = {1,3};
        Assertions.assertArrayEquals(Kata.arrayDiffSteam(a,b), value);
    }
    @Test
    void TestCaseSteam3(){

        int []a= {1, 2, 2, 2, 3};
        int []b ={2};
        int[]value = {1,3};
        Assertions.assertArrayEquals(Kata.arrayDiffSteam(a,b), value);
    }
    @Test
    void TestCaseSteam(){

        int []a= {1,2,3};
        int []b ={};
        int[]value = {1,2,3};
        Assertions.assertArrayEquals(Kata.arrayDiffSteam(a,b), value);
    }


}
