package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String elOrig : origin) {
            check.add(elOrig);
        }
        for (String elDup : duplicate) {
            if (!check.contains(elDup)) {
                result = false;
                break;
            }
        }
        return result;
    }
}