package kyu6.Equal_Sides;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {
    @Test
    public void testCase1(){
        int [] x = {1,2,3,4,3,2,1};
        Assertions.assertEquals(3,Kata.findEvenIndex(x));

    }
    @Test
    public void testCaseFalse(){
        int [] x = {1,2,3,4,5,6};
        Assertions.assertEquals(-1,Kata.findEvenIndex(x));

    }
}