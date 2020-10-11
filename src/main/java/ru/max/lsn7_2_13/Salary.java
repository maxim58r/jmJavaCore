package ru.max.lsn7_2_13;

public class Salary<T> extends AbstractSendable<T> {
    private final T content;

    public Salary(String from, String to, T content) {
        super(from, to);
        this.content = content;
    }

    @Override
    public T getContent() {
        return content;
    }
}
