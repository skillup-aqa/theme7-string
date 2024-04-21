package ua.skillup.part1;

public class AtbashCypher {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String encode(String str) {
       char[] letters = str.toLowerCase().toCharArray();
       char[] encode = new char[letters.length];
       for (int i = 0; i < letters.length; i++){
           if (ALPHABET.indexOf(letters[i]) != -1) {
               encode[i] = ALPHABET.charAt(ALPHABET.length() - ALPHABET.indexOf(letters[i]) - 1);
           }else {
               encode[i] = letters[i];
           }
       }
        return new String(encode);
    }

    public static String decode(String str) {
        return encode(str);
    }
    public static void main(String[] args) {
        System.out.println("Atbash encode - " + AtbashCypher.encode("abcdefghijklmnopqrstuvwxyz + Tati"));
    }
}
