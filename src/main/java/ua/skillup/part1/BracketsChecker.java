package ua.skillup.part1;

public class BracketsChecker {
    public static boolean hasCorrectBrackets(String str) {
        int bracketsChecker = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bracketsChecker++;
            } else if (str.charAt(i) == ')') {
                bracketsChecker--;
            }
            if (bracketsChecker < 0) {
                return false;
            }
        }
        return bracketsChecker == 0;
    }

    public static void main(String[] args) {
        System.out.println("Checking brackets - " + hasCorrectBrackets("example((to check))"));


    }
}
