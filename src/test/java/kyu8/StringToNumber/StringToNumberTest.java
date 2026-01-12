package kyu8.StringToNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumberTest {
    @Test
    void testCase1(){
        Assertions.assertEquals(0,StringToNumber.stringToNumber("0ckou"));
    }
}
