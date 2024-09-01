package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {
    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when472112to159Minus304then520dot6() {
        Point a = new Point(472, 112);
        Point b = new Point(159, -304);
        double expected = 520.6;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus300121toMinus193Minus345then478dot126() {
        Point a = new Point(-300, 121);
        Point b = new Point(-193, -345);
        double expected = 478.126;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when45145toMinus417198then465dot03() {
        Point a = new Point(45, 145);
        Point b = new Point(-417, 198);
        double expected = 465.03;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when135to824then7dot141() {
        Point a = new Point(1, 3, 5);
        Point b = new Point(8, 2, 4);
        double expected = 7.141;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}