package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare cmp = new StringCompare();
        int result = cmp.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare cmp = new StringCompare();
        int result = cmp.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare cmp = new StringCompare();
        int result = cmp.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare cmp = new StringCompare();
        int result = cmp.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(result).isGreaterThan(0);
    }
    
    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare cmp = new StringCompare();
        int result = cmp.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(result).isLessThan(0);
    }
}