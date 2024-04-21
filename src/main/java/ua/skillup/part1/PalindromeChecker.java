package ua.skillup.part1;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        StringBuilder letters = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (Character.isLetter(a)) {
                letters.append(a);
            }
        }
        str = letters.toString();
        return str.equalsIgnoreCase(letters.reverse().toString());
    }

    public static void main(String[] args) {
        // PalindromeChecker Checker = new PalindromeChecker();
        String str = "Mama";
        if (isPalindrome(str)) {
            System.out.println("The string '" + str + "' is a palindrome");
        } else {
            System.out.println("The string '" + str + "' not palindrome");
        }
    }
}
