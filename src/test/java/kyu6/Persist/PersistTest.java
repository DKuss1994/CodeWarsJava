package kyu6.Persist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersistTest {
   @Test
    void testOneDigit(){
       Assertions.assertEquals(0,Persist.persistence(4));
   }
}
