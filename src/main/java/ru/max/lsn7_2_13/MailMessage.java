package ru.max.lsn7_2_13;

public class MailMessage<T> implements Sendable<T> {
    private final String from;
    private final String to;
    private final T content;

    public MailMessage (String from, String to, T content) {
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

    public T getContent() {
        return content;
    }
}
