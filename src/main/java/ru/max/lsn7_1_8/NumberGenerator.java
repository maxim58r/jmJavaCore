package ru.max.lsn7_1_8;

@FunctionalInterface
public interface NumberGenerator<T extends Number>  {
    boolean cond(T arg);
}
