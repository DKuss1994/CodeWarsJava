package kyu6.AreSame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreSameTest {

    @Test
    void testCaseTrue(){
        int [] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int [] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        Assertions.assertTrue(AreSame.comp(a,b));}
    @Test
    void testCaseTrue2(){
        int [] a = {-121, -144, -19, -161, -19, -144, -19, -11};
        int [] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        Assertions.assertTrue(AreSame.comp(a,b));
    }@Test
    void testCaseTrue3(){
        int [] a = {};
        int [] b = {};
        Assertions.assertTrue(AreSame.comp(a,b));
    }
    @Test
    void testCaseFalse(){
        int [] a = {121, 144, 19, 161, 19, 144, 19, 12};
        int [] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        Assertions.assertFalse(AreSame.comp(a,b));
    }
    @Test
    void testCaseFalse2(){
        int [] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int [] b = {12100, 14641, 20736, 361, 25921, 361, 20736, 361};
        Assertions.assertFalse(AreSame.comp(a,b));
    }

    @Test
    void testCaseFalse3(){
        int [] a = {121, 144, 19, 161, 19, 144, 19};
        int [] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        Assertions.assertFalse(AreSame.comp(a,b));
    }

    @Test
    void testCaseFalse5(){
        int [] a = {2,2};
        int [] b = {4,8};
        Assertions.assertFalse(AreSame.comp(a,b));
    }
}