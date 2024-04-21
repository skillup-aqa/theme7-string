package ua.skillup.part1;

public class StringsSorter {
    public static String[] sort(String[] strArray) {
        String temp;
        for (int i = 0; i < strArray.length; i++) {
            for (int k = i + 1; k < strArray.length; k++) {
                if (strArray[i].compareTo(strArray[k]) > 0) {
                    temp = strArray[i];
                    strArray[i] = strArray[k];
                    strArray[k] = temp;
                }
            }
        }
        return strArray;
    }

    public static void main(String[] args) {
        String[] exampleToSort = {"seven", "five", "two", "one", "six", "three", "four"};
        System.out.println(String.join(",", StringsSorter.sort(exampleToSort)));
    }
}
