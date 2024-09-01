package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("х + у = " + sum(10));
        System.out.println("х * у = " + multiply(5));
        System.out.println("y - x = " + minus(15));
        System.out.println("y / x = " + calc.divide(20));
        System.out.println("sum + multiply + minus + divide = " + calc.sumAllOperation(10));
    }
}
