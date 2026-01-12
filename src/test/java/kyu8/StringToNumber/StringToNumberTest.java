package kyu8.StringToNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumberTest {
    @Test
    void testCase1(){
        Assertions.assertEquals(0,StringToNumber.stringToNumber("0"));
    }
    @Test
    void testCase2(){
        Assertions.assertEquals(5,StringToNumber.stringToNumber("5"));
    }
}
