package ru.max.lsn7_2_13;

public abstract class AbstractSendable<T> implements Sendable<T> {
    private final String from;
    private final String to;
    private final T content;

    public AbstractSendable(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public T getContent() {
        return content;
    }

}
