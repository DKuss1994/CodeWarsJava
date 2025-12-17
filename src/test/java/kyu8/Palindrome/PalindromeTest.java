package kyu8.Palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    void truePalindrom(){
        String palindrome = "a";
        Assertions.assertTrue(Palindrome.isPalindrome(palindrome));
    }
}