package kyu7.Summing_a_digits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {
    @Test
    void testCase1(){
        Assertions.assertEquals(5,Kata.sumDigits(14));
    }
    @Test
    void testCase2(){
        Assertions.assertEquals(4,Kata.sumDigits(-13));
    }
}
