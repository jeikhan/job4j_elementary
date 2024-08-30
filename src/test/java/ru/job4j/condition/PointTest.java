package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when472112to159Minus304then520dot6() {
        double expected = 520.6;
        int x1 = 472;
        int y1 = 112;
        int x2 = 159;
        int y2 = -304;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus300121toMinus193Minus345then478dot126() {
        double expected = 478.126;
        int x1 = -300;
        int y1 = 121;
        int x2 = -193;
        int y2 = -345;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when45145toMinus417198then465dot03() {
        double expected = 465.03;
        int x1 = 45;
        int y1 = 145;
        int x2 = -417;
        int y2 = 198;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}