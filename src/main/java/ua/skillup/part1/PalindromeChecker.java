package ua.skillup.part1;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        StringBuilder lettersOnly = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                lettersOnly.append(c);
            }
        }
        str = lettersOnly.toString();
        return str.equalsIgnoreCase(lettersOnly.reverse().toString());
    }
}
