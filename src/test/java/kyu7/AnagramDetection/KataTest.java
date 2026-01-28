package kyu7.AnagramDetection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {
    @Test
    void testTrue(){
        Assertions.assertTrue(Kata.isAnagram("foefet","toffee"));
    }
    @Test
    void testFalse(){
        Assertions.assertFalse(Kata.isAnagram("abc","def"));
    }
}