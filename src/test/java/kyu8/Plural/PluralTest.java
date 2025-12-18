package kyu8.Plural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PluralTest {
    @Test
    void testPlural() {
        float x = 10.0f;
        Assertions.assertTrue(Plural.isPlural(x));
    }

    @Test
    void testPluralfalse() {
        float x = 1.0f;
        Assertions.assertFalse(Plural.isPlural(x));
    }

    @Test
    void testPluralLamba() {
        float x = 10.0f;
        Assertions.assertTrue(Plural.isPluralLamba(x));
    }

    @Test
    void testPluralfalseLamba() {
        float x = 1.0f;
        Assertions.assertFalse(Plural.isPluralLamba(x));
    }
}
