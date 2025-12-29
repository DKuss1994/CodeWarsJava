package kyu6.FindTheUniqueNumber;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class KataTest {
    @Test
    public void TestCase(){
        Assertions.assertEquals(1.0, Kata.findUniq(new double[]{0, 1, 0}));
    }
    @Test
    public void TestCase2(){
        Assertions.assertEquals(2.0,Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }
    @Test
    public void TestCaseLamba(){
        Assertions.assertEquals(1.0, Kata.findUniqLamba(new double[]{0, 1, 0}));
    }
    @Test
    public void TestCaseLamba2(){
        Assertions.assertEquals(2.0,Kata.findUniqLamba(new double[]{1, 1, 1, 2, 1, 1}));
    }
    @Test
    public void TestCaseStream(){
        Assertions.assertEquals(1.0, Kata.findUniqStream(new double[]{0, 1, 0}));
    }
    @Test
    public void TestCaseStream2(){
        Assertions.assertEquals(2.0,Kata.findUniqStream(new double[]{1, 1, 1, 2, 1, 1}));
    }
}