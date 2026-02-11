package kyu6.ReplaceWithAlphabetPosition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {
    @Test
    void testA(){
        String strings = "a";
        Assertions.assertEquals("1",Kata.alphabetPosition(strings));
    }
    @Test
    void testzero(){
        String strings = "";
        Assertions.assertEquals("",Kata.alphabetPosition(strings));
    }
    @Test
    void testAB(){
        String strings = "a b";
        Assertions.assertEquals("1 2",Kata.alphabetPosition(strings));
    }
    @Test
    void testABwithNotSpace(){
        String strings = "ab";
        Assertions.assertEquals("1 2",Kata.alphabetPosition(strings));
    }
    @Test
    void testABwithNotSilicon(){
        String strings = "a'";
        Assertions.assertEquals("1",Kata.alphabetPosition(strings));
    }
    @Test
    void testASmart(){
        String strings = "a";
        Assertions.assertEquals("1",Kata.alphabetPositionSmart(strings));
    }
    @Test
    void testzeroSmart(){
        String strings = "";
        Assertions.assertEquals("",Kata.alphabetPositionSmart(strings));
    }
    @Test
    void testABSmart(){
        String strings = "a b";
        Assertions.assertEquals("1 2",Kata.alphabetPositionSmart(strings));
    }
    @Test
    void testABwithNotSpaceSmart(){
        String strings = "ab";
        Assertions.assertEquals("1 2",Kata.alphabetPositionSmart(strings));
    }
    @Test
    void testABwithNotSiliconSmart(){
        String strings = "a'";
        Assertions.assertEquals("1",Kata.alphabetPositionSmart(strings));
    }
}
