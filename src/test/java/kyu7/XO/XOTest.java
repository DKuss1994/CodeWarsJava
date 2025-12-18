package kyu7.XO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XOTest {

    @Test
void trueTest(){
        String x = "xo";
        Assertions.assertTrue(XO.getXO(x));
    }
    @Test
void falseTest(){
        String x = "xoo";
        Assertions.assertFalse(XO.getXO(x));
    }

    @Test
void trueLengthTest(){
        String x = "xo";
        Assertions.assertTrue(XO.getXOLength(x));
    }
    @Test
void falseLengthTest(){
        String x = "xoo";
        Assertions.assertFalse(XO.getXOLength(x));
    }

}
