import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

package Palindrome;


class palindromeTest {

    @Test
    void testPalindromeLowercase() {
        assertTrue(palindrome.isPalindrome("racecar"));
    }

    @Test
    void testPalindromeUppercase() {
        assertTrue(palindrome.isPalindrome("RACECAR"));
    }

    @Test
    void testPalindromeMixedCase() {
        assertTrue(palindrome.isPalindrome("RaceCar"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(palindrome.isPalindrome("hello"));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(palindrome.isPalindrome("a"));
    }

    @Test
    void testEmptyString() {
        assertTrue(palindrome.isPalindrome(""));
    }

    @Test
    void testPalindromeNumber() {
        assertTrue(palindrome.isPalindrome("12321"));
    }

    @Test
    void testNotPalindromeNumber() {
        assertFalse(palindrome.isPalindrome("12345"));
    }
}