package ru.max.lsn5_4_7;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Serov Maxim
 */
public class Cat implements Serializable {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            return Objects.equals(name, ((Cat) obj).name);
        }
        return false;
    }
}
