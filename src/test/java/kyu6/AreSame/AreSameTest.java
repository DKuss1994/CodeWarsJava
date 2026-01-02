package kyu6.AreSame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreSameTest {

    @Test
    void testCaseTrue(){
        int [] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int [] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        Assertions.assertTrue(AreSame.comp(a,b));
    }
}