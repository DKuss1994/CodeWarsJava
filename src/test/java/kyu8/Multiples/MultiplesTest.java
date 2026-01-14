package kyu8.Multiples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplesTest {
    @Test
    void testCase1(){
        int[]x = {2,4,6};
        Assertions.assertArrayEquals(x,Multiples.find(2,6));
    }
    @Test
    void testCase2(){
        int[]x = {2,4,6};
        Assertions.assertArrayEquals(x,Multiples.findStream(2,6));
    }
}
