package kyu8.AddLength;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddLengthTest {
    @Test
    void testCase1(){
        String[] test = {"ban 3"};
        Assertions.assertArrayEquals(test,AddLength.addLength("ban"));
    }
    @Test
    void testCase2(){
        String[] test = {"0"};
        Assertions.assertArrayEquals(test,AddLength.addLength(""));
    }
    @Test
    void testCaseStream1(){
        String[] test = {"ban 3"};
        Assertions.assertArrayEquals(test,AddLength.addLengthStream("ban"));
    }
    @Test
    void testCaseStream2(){
        String[] test = {"0"};
        Assertions.assertArrayEquals(test,AddLength.addLengthStream(""));
    }
}
