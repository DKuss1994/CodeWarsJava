package kyu8.YesOrNo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu8.YesOrNo.YesOrNo.boolToWord;

public class YesOrNoTest {
    @Test
    public void yesTestCase(){
        Assertions.assertEquals(boolToWord(true),"Yes");
    }
    @Test
    public void noTestCase(){
        Assertions.assertEquals(boolToWord(false),"No");
    }
}
