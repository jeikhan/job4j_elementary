package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 184;
        double man = manWeight(height);
        double woman = womanWeight(height);
        System.out.println("Man " + height + " is " + man);
        System.out.println("Woman " + height + " is " + woman);
    }
}
