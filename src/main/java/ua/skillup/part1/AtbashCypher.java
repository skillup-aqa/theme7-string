package ua.skillup.part1;

import java.awt.*;

public class AtbashCypher {
    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encode(String str) {
        char[] stringArray = str.toLowerCase().toCharArray();
        char[] encodedArray = new char[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            if (ALPHABET.indexOf(stringArray[i]) != -1) {
                encodedArray[i] = ALPHABET.charAt(ALPHABET.length() - ALPHABET.indexOf(stringArray[i]) - 1);
            } else {
                encodedArray[i] = stringArray[i];
            }

        }
        return new String(encodedArray);
    }

    public static String decode(String str) {
        return encode(str);
    }
}
