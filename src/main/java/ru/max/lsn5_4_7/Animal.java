package ru.max.lsn5_4_7;

import java.io.Serializable;
import java.util.Objects;

class Animal implements Serializable {
    private final String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}
