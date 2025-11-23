package kyu7.SumOfOddNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu7.SumOfOddNumbers.RowSumOddNumbers.rowSumOddNumbers;

public class RowSumOddNumbersTest {
    @Test
    public void TestN1(){
        Assertions.assertEquals(rowSumOddNumbers(1),1);

    }
    @Test
    public void TestN2(){
        Assertions.assertEquals(rowSumOddNumbers(2),8);

    }
    @Test
    public void TestN4(){
        Assertions.assertEquals(rowSumOddNumbers(4),64);

    }
}
