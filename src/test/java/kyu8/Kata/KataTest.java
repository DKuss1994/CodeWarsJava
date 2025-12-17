package kyu8.Kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {
    @Test
    void aTest(){
        char a = 'a';
        Assertions.assertEquals("Position of alphabet: 1",Kata.position(a));}
    @Test
    void nTest(){
        char n = 'n';

        Assertions.assertEquals("Position of alphabet: 14",Kata.position(n));

    }@Test
    void sTest(){
        char n = 's';

        Assertions.assertEquals("Position of alphabet: 19",Kata.position(n));

    }

}
