package kyu8.TwiceAsOld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu8.TwiceAsOld.TwiceAsOld.twiceAsOld;

public class TwiceAsOldTest {
    @Test
    public void TestCase1(){
        Assertions.assertEquals(twiceAsOld(30,0),30);
    }
}
