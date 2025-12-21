package kyu6.ArrayDiff;

import kyu6.Kata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.Arrays;

public class KataTest {
    @Test
    void TestCase1(){

        int []a= {1,2,3};
        int []b ={2};
        int[]value = {1,3};
        Assertions.assertTrue(Arrays.equals(a,value));
    }
    @Test
    void TestCase(){

        int []a= {1,2,3};
        int []b ={};
        int[]value = {1,2,3};
        Assertions.assertTrue(Arrays.equals(a,value));
    }


}
