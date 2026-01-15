package kyu6.Two_Sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void TestCase(){
        int[]x ={1,2,3};
        int[]value = {0,2};
        Assertions.assertArrayEquals(value,Solution.twoSum(x,4));
    }
    @Test
    void TestCase2(){
        int[]x ={3,2,4};
        int[]value = {1,2};
        Assertions.assertArrayEquals(value,Solution.twoSum(x,6));
    }

}