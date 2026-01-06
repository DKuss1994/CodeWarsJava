package kyu7.Money;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {
    @Test
    void testCase1() {
        Assertions.assertEquals(3,Money.calculateYears(1000, 0.05, 0.18, 1100)) ;

    }
}