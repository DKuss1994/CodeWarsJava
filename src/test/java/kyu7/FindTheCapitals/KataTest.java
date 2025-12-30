package kyu7.FindTheCapitals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class KataTest {
    @Test
    void testCase1(){
        int[]value={0,1,2};
        String x = "ABC";
        Assertions.assertTrue(Arrays.equals(value,Kata.capitals(x)));
    }

}