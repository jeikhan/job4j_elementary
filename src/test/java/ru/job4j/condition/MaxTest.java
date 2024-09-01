package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxNegative5ToNegative3ThenNegative3() {
        int left = -5;
        int right = -3;
        int result = Max.max(left, right);
        int expected = -3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus1To0To1Then1() {
        int first = -1;
        int second = 0;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus5To0To2ToMinus3Then2() {
        int first = -5;
        int second = 0;
        int third = 2;
        int fourth = -3;
        int result = Max.max(first, second, third, fourth);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}