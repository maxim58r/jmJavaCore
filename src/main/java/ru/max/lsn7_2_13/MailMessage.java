package ru.max.lsn7_2_13;

public class MailMessage implements Sendable {
    private final String from;
    private final String to;
    private final String content;

    public MailMessage (String from, String to, String content) {
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
    public String getContent() {
        return content;
    }
}
