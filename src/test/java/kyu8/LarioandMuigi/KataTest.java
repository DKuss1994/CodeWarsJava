package kyu8.LarioandMuigi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {
    @Test
    void testCase1(){
        int [] input= {1,2};
        int[]value = {1,2};
        Assertions.assertArrayEquals(value,Kata.pipeFix(input));
    }
    @Test
    void testCase2(){
        int [] input= {-1,2};
        int[]value = {-1,0,1,2};
        Assertions.assertArrayEquals(value,Kata.pipeFix(input));
    }
}
