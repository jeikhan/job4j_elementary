package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus7To10Then18() {
        int start = -7;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus13ToMinus3ThenMinus40() {
        int start = -13;
        int finish = -3;
        int result = Counter.sumByEven(start, finish);
        int expected = -40;
        assertThat(result).isEqualTo(expected);
    }
}