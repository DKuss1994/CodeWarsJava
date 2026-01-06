package kyu8.Welcome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WelcomeTest {
    @Test
    void testCaseEnglish(){
        Assertions.assertEquals("Welcome",Welcome.greet("english"));
    }
    @Test
    void testCaseWrong(){
        Assertions.assertEquals("Welcome",Welcome.greet("basas"));
    }
}