package ru.max.lsn7_2_13;

public interface Sendable<T> {
    String getFrom();

    String getTo();

    T getContent();

}
