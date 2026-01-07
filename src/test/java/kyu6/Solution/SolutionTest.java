package kyu6.Solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void testCase1() {
        Assertions.assertEquals(9, Solution.solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2));

    }
    @Test
    void testCase2() {
        Assertions.assertEquals(18, Solution.solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 1));

    }
    @Test
    void testCase3() {
        Assertions.assertEquals(7, Solution.solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 3));

    }
    @Test
    void testCase4() {
        Assertions.assertEquals(10, Solution.solveSuperMarketQueue(new int[]{10, 4, 4}, 2));

    }
}
