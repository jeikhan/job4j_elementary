package ru.job4j.collection;

import java.util.Objects;

public class Order {
    private final String number;
    private final String name;

    public Order(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Order order)) {
            return false;
        }
        return Objects.equals(name, order.name) && Objects.equals(number, order.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public String toString() {
        return "Order{"
                + "number='" + number + '\''
                + ", name='" + name + '\''
                + '}';
    }
}