package kyu7.SimpleFunReverseLetter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {
    @Test
    void test1(){
        Assertions.assertEquals("abc",Kata.reverseLetter("cba"));
    }

    @Test
    void test2(){
        Assertions.assertEquals("abc",Kata.reverseLetter("!c!22b22a"));
    }

}
