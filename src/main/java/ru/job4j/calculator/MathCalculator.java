package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceAndQuotient(double first, double second) {
        return difference(first, second) + quotient(first, second);
    }

    public static double sumEverything(double first, double second) {
        return sumAndMultiply(first, second) + differenceAndQuotient(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сложение суммы и произведения: " + sumAndMultiply(10, 20));
        System.out.println("Сложение разности и частного: " + differenceAndQuotient(10, 20));
        System.out.println("Сложение результата всех четырёх операций: " + sumEverything(10, 20));
    }
}
