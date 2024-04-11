package ua.skillup.part1;

public class AtbashCypher {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encode(String str) {
        char [] chars = str.toLowerCase().toCharArray();
        char [] encoded = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (ALPHABET.indexOf(chars[i]) != -1) {
                encoded[i] = ALPHABET.charAt(ALPHABET.length() - ALPHABET.indexOf(chars[i]) - 1);
            } else {
                encoded[i] = chars[i];
            }
        }

        return new String(encoded);
    }

    public static String decode(String str) {
        return encode(str);
    }
}
