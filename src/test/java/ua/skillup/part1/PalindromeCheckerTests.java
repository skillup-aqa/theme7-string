package ua.skillup.part1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PalindromeCheckerTests {
    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("madam"));
    }

    @Test
    public void testIsNotPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("mama"));
    }

    @Test
    public void testIsEmptyStringAPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }
}
