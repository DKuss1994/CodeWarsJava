package kyu7.XO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XOTest {

    @Test
void trueTest(){
        String x = "xo";
        Assertions.assertTrue(XO.getXO(x));
    }

}
