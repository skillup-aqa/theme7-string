package ua.skillup.part1;

public class BracketsChecker {
    public static boolean hasCorrectBrackets(String str) {
        int openedBrackets = 0;
        int closedBrackets = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                openedBrackets++;
            }
            if (str.charAt(i) == ')') {
                closedBrackets++;
            }
            if (closedBrackets > openedBrackets) {
                return false;
            }

        }
        return openedBrackets == closedBrackets;
    }
}
