package kyu6.CountCharactersInYourString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class KataTest {
    @Test
    void testCaseEmpty(){
        Map<Character,Integer> countCharacter = new HashMap<>();
        Assertions.assertEquals(countCharacter,Kata.count(""));
    }
    @Test
    void testCase1(){
        Map<Character,Integer> countCharacter = new HashMap<>();
        countCharacter.put('a',1);
        Assertions.assertEquals(countCharacter,Kata.count("a"));
    }
    @Test
    void testCase2(){
        Map<Character,Integer> countCharacter = new HashMap<>();
        countCharacter.put('a',5);
        Assertions.assertEquals(countCharacter,Kata.count("aaaaa"));
    }
    @Test
    void testCaseRandomChars(){
        Map<Character,Integer> countCharacter = new HashMap<>();
        countCharacter.put('a',2);
        countCharacter.put('b',2);
        countCharacter.put('c',2);
        Assertions.assertEquals(countCharacter,Kata.count("acabcb"));
    }
    @Test
    void testCaseEmptyStream(){
        Map<Character,Integer> countCharacter = new HashMap<>();
        Assertions.assertEquals(countCharacter,Kata.countStream(""));
    }
    @Test
    void testCaseStream1(){
        Map<Character,Integer> countCharacter = new HashMap<>();
        countCharacter.put('a',1);
        Assertions.assertEquals(countCharacter,Kata.countStream("a"));
    }
    @Test
    void testCaseStream2(){
        Map<Character,Integer> countCharacter = new HashMap<>();
        countCharacter.put('a',5);
        Assertions.assertEquals(countCharacter,Kata.countStream("aaaaa"));
    }
    @Test
    void testCaseRandomCharsStream(){
        Map<Character,Integer> countCharacter = new HashMap<>();
        countCharacter.put('a',2);
        countCharacter.put('b',2);
        countCharacter.put('c',2);
        Assertions.assertEquals(countCharacter,Kata.countStream("acabcb"));
    }
}
