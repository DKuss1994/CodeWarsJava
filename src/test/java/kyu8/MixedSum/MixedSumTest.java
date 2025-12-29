package kyu8.MixedSum;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class MixedSumTest {
@Test
public void testCase1(){
    Assertions.assertEquals(10,MixedSum.sum(Arrays.asList(5,"5")));
}
}