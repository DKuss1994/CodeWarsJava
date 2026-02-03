package kyu8.Ascii;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AsciiTest {
    @Test
    void testCase1(){
        assertEquals('7', Ascii.getChar(55));
    }
}
