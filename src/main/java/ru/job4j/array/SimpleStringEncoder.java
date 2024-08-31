package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result = result + symbol + (counter == 1 ? "" : counter);
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        return result + symbol + (counter == 1 ? "" : counter);
    }
}
