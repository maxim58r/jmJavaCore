package ru.max.lsn7_2_13;

public class Salary<T> extends AbstractSendable<T> {

    public Salary(String from, String to, T content) {
        super(from, to, content);
    }
}
