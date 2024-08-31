package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThreeNumbers() {
        int[] data = new int[]{78, 13, 56};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{13, 56, 78};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFiveNumbers() {
        int[] data = new int[]{7, 9, 0, -33, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-33, 0, 7, 9, 10};
        assertThat(result).containsExactly(expected);
    }
}