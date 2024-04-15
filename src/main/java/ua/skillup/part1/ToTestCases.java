package ua.skillup.part1;

public class ToTestCases {
    public static void main(String[] args) {
        String[] testArray = {"mama", "Mama", "zorro", "papa", "archer", "Papa", "diamond", "01 point"};
        System.out.println("Palindrome checker: " + PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama!"));
        System.out.println("Sorting string array: " + String.join(", ", StringsSorter.sort(testArray)));
        System.out.println("Checking brackets: " + BracketsChecker.hasCorrectBrackets("(some(value))"));
    }
}
