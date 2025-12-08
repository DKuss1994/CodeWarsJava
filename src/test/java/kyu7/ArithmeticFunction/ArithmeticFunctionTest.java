package kyu7.ArithmeticFunction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static kyu7.ArithmeticFunction.ArithmeticFunction.arithmetic;
import static kyu7.ArithmeticFunction.ArithmeticFunction.arithmeticSwitch;

class ArithmeticFunctionTest {
    @Test
    public void testCaseAdd(){
        Assertions.assertEquals(arithmetic(5,5,"add"),10);
        Assertions.assertEquals(arithmetic(20,78,"add"),98);
        Assertions.assertEquals(arithmetic(5,-5,"add"),0);
        Assertions.assertEquals(arithmetic(-10,5,"add"),-5);
    }@Test
    public void testCaseSubtract(){
        Assertions.assertEquals(arithmetic(5,5,"subtract"),0);
        Assertions.assertEquals(arithmetic(20,78,"subtract"),-58);
        Assertions.assertEquals(arithmetic(5,-5,"subtract"),10);
        Assertions.assertEquals(arithmetic(-10,5,"subtract"),-15);
    }@Test
    public void testCaseMultiply(){
        Assertions.assertEquals(arithmetic(5,5,"multiply"),25);
        Assertions.assertEquals(arithmetic(20,8,"multiply"),160);
        Assertions.assertEquals(arithmetic(-5,-5,"multiply"),25);
        Assertions.assertEquals(arithmetic(-10,5,"multiply"),-50);
    }@Test
    public void testCaseDivide(){
        Assertions.assertEquals(arithmetic(5,5,"divide"),1);
    }
}class ArithmeticFunctionTestSwitch {
    @Test
    public void testCaseAdd(){
        Assertions.assertEquals(arithmeticSwitch(5,5,"add"),10);
        Assertions.assertEquals(arithmeticSwitch(20,78,"add"),98);
        Assertions.assertEquals(arithmeticSwitch(5,-5,"add"),0);
        Assertions.assertEquals(arithmeticSwitch(-10,5,"add"),-5);
    }@Test
    public void testCaseSubtract(){
        Assertions.assertEquals(arithmeticSwitch(5,5,"subtract"),0);
        Assertions.assertEquals(arithmeticSwitch(20,78,"subtract"),-58);
        Assertions.assertEquals(arithmeticSwitch(5,-5,"subtract"),10);
        Assertions.assertEquals(arithmeticSwitch(-10,5,"subtract"),-15);
    }@Test
    public void testCaseMultiply(){
        Assertions.assertEquals(arithmeticSwitch(5,5,"multiply"),25);
        Assertions.assertEquals(arithmeticSwitch(20,8,"multiply"),160);
        Assertions.assertEquals(arithmeticSwitch(-5,-5,"multiply"),25);
        Assertions.assertEquals(arithmeticSwitch(-10,5,"multiply"),-50);
    }@Test
    public void testCaseDivide(){
        Assertions.assertEquals(arithmeticSwitch(5,5,"divide"),1);
    }
}