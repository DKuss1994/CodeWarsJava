package kyu7.SumOfTheFirstNthTermOfSeries;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NthSeriesTest {
    @Test
    void test0(){
        Assertions.assertEquals("0.00",NthSeries.seriesSum(0));
    }
    @Test
    void test1(){
        Assertions.assertEquals("1.00",NthSeries.seriesSum(1));
    }
    @Test
    void test5(){
        Assertions.assertEquals("1.57",NthSeries.seriesSum(5));
    }
}
