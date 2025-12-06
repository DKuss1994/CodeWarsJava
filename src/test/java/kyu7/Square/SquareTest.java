package kyu7.Square;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu7.Square.Square.isSquare;

public class SquareTest {
   @Test
    public void testcase(){
       Assertions.assertTrue(isSquare(25));

   }
   @Test
    public void testcase2(){
       Assertions.assertFalse(isSquare(26));

   }
   @Test
    public void testcase3(){
       Assertions.assertFalse(isSquare(-1));

   }
}