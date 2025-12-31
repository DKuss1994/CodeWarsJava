package kyu6.Persist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersistTest {
    @Test
    void testZeroDigit() {
        Assertions.assertEquals(0, Persist.persistence(4));
    }

    @Test
    void testOneDigit() {
        Assertions.assertEquals(1, Persist.persistence(12));
    }


    @Test
    void testTwoDigit() {
        Assertions.assertEquals(3, Persist.persistence(39));
    }
}

