package ru.job4j.collection;

import java.util.Objects;

public class Task {
    private final String number;
    private final String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Task task)) {
            return false;
        }
        return Objects.equals(number, task.number) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, description);
    }
}