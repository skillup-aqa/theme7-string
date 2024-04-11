package ua.skillup.part1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class BracketsCheckerTests {
    @Test
    public void testCorrectBrackets() {
        assertTrue(BracketsChecker.hasCorrectBrackets("()"));
    }

    @Test
    public void testHasCorrectBrackets2() {
        assertTrue(BracketsChecker.hasCorrectBrackets("()()"));
    }

    @Test
    public void testHasUnclosedBracket() {
        assertFalse(BracketsChecker.hasCorrectBrackets("()("));
    }

    @Test
    public void testHasUnopenedBracket() {
        assertFalse(BracketsChecker.hasCorrectBrackets(")("));
    }

    @Test
    public void testEmptyString() {
        assertTrue(BracketsChecker.hasCorrectBrackets(""));
    }

    @Test
    public void testStringWithoutBrackets() {
        assertTrue(BracketsChecker.hasCorrectBrackets("Hello World!"));
    }

}
