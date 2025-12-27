package kyu6.FindTheUniqueNumber;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class KataTest {
    @Test
    public void TestCase(){
        Assertions.assertEquals(1.0, Kata.findUniq(new double[]{0, 1, 0}));
    }
}