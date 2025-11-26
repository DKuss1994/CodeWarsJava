package kyu7.RemoveTheinimum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu7.RemoveTheinimum.Remover.removeSmallest;

public class RemoverTest {


    @Test
    public void TestCase1(){
        int [] testNumbers1 = {1,2,2,3};

        int [] testCase1 = {2,2,3};
        Assertions.assertArrayEquals(removeSmallest(testNumbers1),testCase1);
    }
    @Test
    public void TestCase2(){
        int [] testNumbers1 = {5,2,2,3};

        int [] testCase1 = {5,2,3};
        Assertions.assertArrayEquals(removeSmallest(testNumbers1),testCase1);
    }
    @Test
    public void TestCase3(){
        int [] testNumbers1 = {};

        int [] testCase1 = {};
        Assertions.assertArrayEquals(removeSmallest(testNumbers1),testCase1);
    }
}
