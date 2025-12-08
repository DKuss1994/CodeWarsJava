package kyu7.ArithmeticFunction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu7.ArithmeticFunction.ArithmeticFunction.arithmetic;

class ArithmeticFunctionTest {
    @Test
    public void testCaseAdd(){
        Assertions.assertEquals(arithmetic(5,5,"add"),10);
        Assertions.assertEquals(arithmetic(20,78,"add"),98);
        Assertions.assertEquals(arithmetic(5,-5,"add"),0);
        Assertions.assertEquals(arithmetic(-10,5,"add"),-5);
    }
}