package kyu7.Mumbling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu7.Mumbling.Accumul.accum;

public class AccumulTest {
    @Test
    public void testCase1(){
        Assertions.assertEquals(accum("abcd"),"A-Bb-Ccc-Dddd");
    }
}
