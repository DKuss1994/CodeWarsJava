package kyu7.FindTheCapitals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 public class KataTest {
    @Test
    void testCase1(){
        int[]value={0,1,2};
        String x = "ABC";
        Assertions.assertEquals(value,Kata.capitals(x));
    }

}