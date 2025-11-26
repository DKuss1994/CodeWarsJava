package kyu7.TwoToOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu7.TwoToOne.TwoToOne.longest;

public class TwoToOneTest {
    @Test
    public void TestCase1(){
        String a = "abcdefghijklmnopqrstuvwxyz";
        Assertions.assertEquals(longest(a,a),a);
    }
}
