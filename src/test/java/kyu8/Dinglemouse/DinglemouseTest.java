package kyu8.Dinglemouse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static kyu8.Dinglemouse.Dinglemouse.humanYearsCatYearsDogYears;

public class DinglemouseTest {
    @Test
    public void testCase1(){
        final int human = 1;
        int cat = 15;
        int dog = 15;
        int [] testYears = {human,cat,dog};

        Assertions.assertTrue(humanYearsCatYearsDogYears(1).equals(testYears));
    }
}
