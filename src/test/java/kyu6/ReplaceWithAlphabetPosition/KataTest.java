package kyu6.ReplaceWithAlphabetPosition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {
    @Test
    void testA(){
        String strings = "a";
        Assertions.assertEquals("1",Kata.alphabetPosition(strings));
    }
}
