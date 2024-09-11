package ru.job4j.collection;

import java.util.Objects;

public record Citizen(String passport, String username) {

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Citizen citizen)) {
            return false;
        }
        return Objects.equals(passport, citizen.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(passport);
    }
}