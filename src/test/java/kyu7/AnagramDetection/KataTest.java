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
    @Test
    void testSortTrue(){
        Assertions.assertTrue(Kata.isAnagramSort("foefet","toffee"));
    }
    @Test
    void testSortFalse(){
        Assertions.assertFalse(Kata.isAnagramSort("abc","def"));
    }
}