package ua.skillup.part1;

public class BracketsChecker {
    public static boolean hasCorrectBrackets(String str) {
        int opened = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                opened++;
            } else if (str.charAt(i) == ')') {
                opened--;
            }

            if (opened < 0) {
                return false;
            }
        }

        return opened == 0;
    }
}
