package kyu7.JadenCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class JadenCaseTest {
    JadenCase jadenCase = new JadenCase();

    @Test
    public void testNullArg() {
        assertNull( jadenCase.toJadenCase(null));
    }
    @Test
    public void testEmptyArg() {
        assertNull(jadenCase.toJadenCase(""));
    }
    @Test
    public void testCase(){
        String x = "How can mirrors be real if our eyes aren't real";
        String test = "How Can Mirrors Be Real If Our Eyes Aren't Real";
        assertEquals(jadenCase.toJadenCase(x),test);
    }

}

