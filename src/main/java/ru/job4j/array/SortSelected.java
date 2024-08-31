package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int start = 0; start < data.length; start++) {
            int min = MinDiapason.findMin(data, start, data.length - 1);
            int index = FindLoop.indexInRange(data, min, start, data.length - 1);
            SwitchArray.swap(data, start, index);
        }
        return data;
    }
}
