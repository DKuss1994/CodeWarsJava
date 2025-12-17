package kyu8.Palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    void truePalindrom(){
        String palindrome = "a";
        Assertions.assertTrue(Palindrome.isPalindrome(palindrome));
        palindrome = "aba";
        Assertions.assertTrue(Palindrome.isPalindrome(palindrome));
        palindrome = "Abba";
        Assertions.assertTrue(Palindrome.isPalindrome(palindrome));
    }
    @Test
    void falsePalindrom(){
        String palindrome ="hello";
        Assertions.assertFalse(Palindrome.isPalindrome(palindrome));
        palindrome ="DENNis";
        Assertions.assertFalse(Palindrome.isPalindrome(palindrome));
    palindrome ="MAX";
        Assertions.assertFalse(Palindrome.isPalindrome(palindrome));
    }
}