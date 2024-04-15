package ua.skillup.part1;

public class BracketsChecker {
    public static boolean hasCorrectBrackets(String str) {
        int bracketCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bracketCounter++;
            }
            if (str.charAt(i) == ')') {
                bracketCounter--;
            }
        }
        return bracketCounter == 0;
    }
}
