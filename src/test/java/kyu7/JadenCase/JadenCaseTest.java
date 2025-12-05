package kyu7.JadenCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class JadenCaseTest {
    JadenCase jadenCase = new JadenCase();

    @Test
    public void testNullArg() {
        assertNull( jadenCase.toJadenCase(null));
    }

}