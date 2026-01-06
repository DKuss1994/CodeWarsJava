package kyu6.BuildTower;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {
    @Test
    void testCase1(){
        String[] x = {
                "  *  ",
                " *** ",
                "*****"
        };
        Assertions.assertArrayEquals(x,Kata.towerBuilder(3));
    }
    @Test
    void testCase2(){
        String[] x = {
                "*",

        };
        Assertions.assertArrayEquals(x,Kata.towerBuilder(1));
    }

    @Test
    void testCase3(){
        Assertions.assertThrows(ArithmeticException.class,()->Kata.towerBuilder(-1));
    }
}