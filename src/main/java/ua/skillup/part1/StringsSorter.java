package ua.skillup.part1;

public class StringsSorter {
    public static String[] sort(String[] strArray) {
        String temp;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].compareTo(strArray[j]) > 0) {
                    temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }
        return strArray;
    }
}
