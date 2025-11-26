package kyu7.RemoveTheinimum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu7.RemoveTheinimum.Remover.removeSmallest;

public class RemoverTest {

    int [] testNumbers1 = {1,2,2,3};

    int [] testCase1 = {2,2,3};
    @Test
    public void TestCase1(){
        Assertions.assertEquals(removeSmallest(testNumbers1),testCase1);
    }
}
