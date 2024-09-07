package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UniqueTextTest {
    @Test
    public void isEquals() {
        String origin = "My cat eats a mouse";
        String text = "My cat eats a mouse";
        assertThat(UniqueText.isEquals(origin, text)).isTrue();
    }

    @Test
    public void isNotEquals() {
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertThat(UniqueText.isEquals(origin, text)).isFalse();
    }
}